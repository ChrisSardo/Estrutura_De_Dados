package parte03;

public class NoArvoreBinaria {
    private Integer info;
    private NoArvoreBinaria esq;
    private NoArvoreBinaria dir;
    public NoArvoreBinaria(Integer info, NoArvoreBinaria esq, NoArvoreBinaria dir) {
        this.info = info;
        this.esq = esq;
        this.dir = dir;
    }
    public NoArvoreBinaria(Integer info) {
        this.info = info;
    }

    public Integer getInfo() { return info; }
    public void setInfo(Integer info) { this.info = info; }
    public NoArvoreBinaria getEsq() { return esq; }
    public void setEsq(NoArvoreBinaria esq) { this.esq = esq; }
    public NoArvoreBinaria getDir() { return dir; }
    public void setDir(NoArvoreBinaria dir) { this.dir = dir; }
    public String toString() {
        return "No árvore com informação de " + this.getInfo();
    }

}