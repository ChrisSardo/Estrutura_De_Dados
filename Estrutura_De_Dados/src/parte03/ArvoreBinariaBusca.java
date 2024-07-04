package parte03;

public class ArvoreBinariaBusca {
    private NoArvoreBinaria raiz;
    public ArvoreBinariaBusca() {
        this.raiz = null;
    }
    private NoArvoreBinaria getRaiz() {
        return raiz;
    }
    private void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public void insere(int v) {
        setRaiz(insere(raiz, v));
    }
    private NoArvoreBinaria insere(NoArvoreBinaria r, int v) {
        if (r == null) {
            r = new NoArvoreBinaria(v);
            r.setDir(null);
            r.setEsq(null);
        } else if (v < r.getInfo()) {
            r.setEsq(insere(r.getEsq(), v));
        } else {
            r.setDir(insere(r.getDir(), v));
        }
        return r;
    }
    public void retira(int v){ setRaiz(retira(raiz,v)); }
    private NoArvoreBinaria retira(NoArvoreBinaria r, int v){
        if(r == null){
            return null;
        }else{
            if (v < r.getInfo()) {
                r.setEsq(retira(r.getEsq(), v));
            }else{
                if (v > r.getInfo()) {
                    r.setDir(retira(r.getDir(), v));
                }else{
                    if (r.getEsq() == null && r.getDir() == null) {
                        r = null;
                    }else{
                        if (r.getEsq() == null) {
                            r = r.getDir();
                        }else{
                            if (r.getDir() == null) {
                                r = r.getEsq();
                            }else{
                                NoArvoreBinaria p = r.getEsq();
                                while(p.getDir() != null){
                                    p = p.getDir();
                                }
                                r.setInfo(p.getInfo());
                                p.setInfo(v);
                                r.setEsq(retira(r.getEsq(),v));
                            }
                        }
                    }
                }
            }
        }
        return r;
    }
    public NoArvoreBinaria busca(int v) {
        return busca(this.raiz, v);
    }
    private NoArvoreBinaria busca(NoArvoreBinaria r, int v) {
        if (r == null) {
            return null;
        } else if (v < r.getInfo()) {
            return busca(r.getEsq(), v);
        } else if (v > r.getInfo()) {
            return busca(r.getDir(), v);
        } else {
            return r;
        }
    }
    @Override
    public String toString() {
        String s = imprimeIn(raiz);
        return s;
    }
    public String toStringDecrescente(){
        String s = imprimePos(raiz);
        return s;
    }
    public String imprimePos(NoArvoreBinaria n) {
        String s = new String("");
        s += "";
        if (n != null) {
            s += imprimePos(n.getDir());//trata sae
            s += n.getInfo()+ " ";//trata raiz
            s += imprimePos(n.getEsq());//tratas sad. Para outras chamadas apenas trocar a ordem
        }
        s += "";
        return s;
    }
    public String imprimeIn( NoArvoreBinaria n) {
        String s = new String("");
        s += "";
        if (n != null) {
            s += imprimeIn(n.getEsq());//trata sae
            s += n.getInfo()+ " ";//trata raiz
            s += imprimeIn(n.getDir());//trata sad. Para outras chamadas apenas trocar a ordem
        }
        s += "";
        return s;
    }
}