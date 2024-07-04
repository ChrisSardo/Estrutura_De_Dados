package parte03;

import java.util.NoSuchElementException;

public class FilaComEncadeamento extends Object implements Fila{
    private NoLista first;
    private NoLista last;
    private int counter;
    public FilaComEncadeamento(){
        this.first = null;
        this.last = null;
        this.counter = 0;
    }

    @Override
    public void add(Integer element) {
        NoLista node = new NoLista(element, null);
        if(first == null){
            this.first = node;
        } else {
            this.last.setNext(node);
        }
        this.last = node;
        counter ++;
    }

    @Override
    public Integer remove() {
        if(counter == 0){
            throw new NoSuchElementException();
        }
        Integer info = first.getInfo();
        first = first.getNext();
        counter --;
        return info;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        counter = 0;
    }

    @Override
    public boolean isEmpty() {
        return (counter == 0);
    }

    @Override
    public int size() {
        return counter;
    }

    public String toString2() {
        String myarray1 = "INI [";
        NoLista aux = first;
        while(aux != null){
            myarray1 += aux.getInfo();
            if (aux.getNext() != null){
                myarray1 += ", ";
            }
            aux = aux.getNext();
        }
        myarray1 += "] FIM";
        return myarray1;

    }
}
