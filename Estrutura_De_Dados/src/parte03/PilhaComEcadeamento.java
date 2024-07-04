package parte03;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class PilhaComEcadeamento implements Pilha{

    private NoLista topNode;
    private int counter;

    public PilhaComEcadeamento(){
        this.topNode = null;
        this.counter = 0;
    }
    @Override
    public void push(Integer element) {
        NoLista node = new NoLista(null, null);
        node.setInfo(element);
        if (topNode != null){
            node.setNext(topNode);
        }
        this.topNode = node;
        counter++;

    }

    @Override
    public Integer pop() {
        if (counter == 0){
            throw new EmptyStackException();
        }
        Integer info = topNode.getInfo();
        topNode = topNode.getNext();
        counter--;
        return info;
    }

    @Override
    public Integer top() {
        if (counter == 0){
            throw new EmptyStackException();
        }
        Integer info = topNode.getInfo();
        return info;
    }

    @Override
    public void clear() {
        topNode = null;
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

    public String toString(){
        String myarray1 = "TOP [";
        NoLista aux = topNode;
        while (aux != null){
            myarray1 += aux.getInfo();
            if (aux.getNext() != null){
                myarray1 += ", ";
            }
            aux = aux.getNext();
        }
        myarray1 += "]";
        return myarray1;

    }
}
