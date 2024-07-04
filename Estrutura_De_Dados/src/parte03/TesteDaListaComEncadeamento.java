package parte03;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class TesteDaListaComEncadeamento {
    public static void main(String[] args) {

        LinkedList numeros2 = new LinkedList();
        ListaComEncadeamento numeros = new ListaComEncadeamento();
        System.out.println(numeros);

        numeros.add(903);
        numeros.add(105);
        numeros.add(45);
        numeros.add(1);
        numeros.add(890);
        numeros.add(1902);
        System.out.println(numeros);
        System.out.println("Existe o 66?" + numeros.contains(66));
        System.out.println("Existe o 45?" + numeros.contains(45));

        numeros.add(0, 777);
        System.out.println(numeros);
        numeros.add(7, 1 );
        System.out.println(numeros);
        System.out.println("Qual o tamanho?" + numeros.size());
        System.out.println("Removeu o elemento no índice 0: " + numeros.remove(0));
        System.out.println("Removeu o elemento no índice 4: " + numeros.remove(4));
        System.out.println(numeros);

        if(!numeros.isEmpty()){
            for (int i = 0; i < numeros.size(); i++){
                System.out.println(numeros.get(i) + " ");
            }
            System.out.println("FIM");
        }
        System.out.println("Valor que saiu da lista: " + numeros.set(1, 890));
        System.out.println("Valor que saiu da lista: " + numeros.set(5, 890));
        System.out.println(numeros);
        System.out.println("Último índice do valor '890': " + numeros.lastIndexOf(890));

        numeros.clear();
        System.out.println(numeros.size());
        System.out.println(numeros);
    }

}
