package parte03;

public class TestesABB {
    public static void main(String[] args) {
        ArvoreBinariaBusca a = new ArvoreBinariaBusca();
        a.insere(6);
        a.insere(8);
        a.insere(2);
        a.insere(1);
        a.insere(4);
        a.insere(3);
        System.out.println(a.toStringDecrescente());
        System.out.println(a);
        a.retira(4);
        System.out.println(a.toStringDecrescente());
        System.out.println(a);
    }
}