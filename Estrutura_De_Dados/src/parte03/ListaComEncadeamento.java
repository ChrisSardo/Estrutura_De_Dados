package parte03;

public class ListaComEncadeamento {

    private NoLista first;
    private NoLista last;
    private int counter;

    public ListaComEncadeamento() {
        this.first = null;
        this.last = null;
        this.counter = 0;
    }

    public void add(Integer element) {
        NoLista node = new NoLista(element, null);
        if(first == null){
            this.first = node;
        } else{
            this.last.setNext(node);
        }
        this.last = node;
        counter ++;
    }

    public void add(int index, Integer element) {
        if(index < 0 || index > counter){
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        NoLista novo = new NoLista(element, null);
        if(index == 0){
            novo.setNext(first);
            first = novo;
        } else if (index == counter){
            last.setNext(novo);
            last = novo;
        } else {
            NoLista aux = first;
            for (int i = 0; i < index-1; i++){
                aux = aux.getNext();
            }
            novo.setNext(aux.getNext());
            aux.setNext(novo);
        }
        counter++;
    }

    public Integer remove(int index) {
        if(index < 0 || index >= counter){
            throw new IndexOutOfBoundsException("Index: ");
        }
        //verificar e salvar o anterior e não o próximo
        Integer info = null;
        NoLista atual = first;
        for (int i = 0; i < index -1; i++) {
            if(index-1 == i){
                info = atual.getNext().getInfo();
                atual.setNext(atual.getNext().getNext());
            } else if(index == counter-1) {
                info = atual.getNext().getInfo();
                atual.setNext(null);
                last = atual;
            }
        }
        return info;
    }

    public boolean removeFirst(Integer element) {
        if(counter == 0){
            return false;
        }
        first = first.getNext();
        return true;
    }

    public Integer get(int index) {
        if(index < 0 || index >= counter){
            throw new IndexOutOfBoundsException("Index: ");
        }
        NoLista aux = first;
        for(int i = 0; i<index-1; i++){
            aux = aux.getNext();
        }
        return aux.getInfo();
    }

    public void clear() {
        first = null;
        last = null;
        counter = 0;
    }

    public Integer set(int index, Integer element) {
        if (index < 0 || index >=counter){
            throw new IndexOutOfBoundsException("Index: " + index + " Fora dos limites");
        }
        NoLista aux = first;
        for (int i = 0; i< index; i++){
            aux = aux.getNext();
        }
        Integer toReturn = aux.getInfo();
        aux.setInfo(element);
        return toReturn;
    }

    public int size() {
        return counter;
    }

    public boolean isEmpty(){
        return (    counter == 0);
    }

    public boolean contains(Integer element){
        NoLista aux = first;
        for (int i = 0; i != counter -1; i++) {
            if(aux.getInfo().equals(element)){
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }
    public int indexOf(Integer element){
        NoLista aux = first;
        for (int i = 0; i != counter -1; i++) {
            if(aux.getInfo().equals(element)){
                return i;
            }
            if(i != counter){
                aux = aux.getNext();
            }
        }
        return -1;
    }
    public int lastIndexOf(Integer element){
        return 1;

    }
    public Integer[] toArray(){
        return null;

    }
    public String toString(){
        String myarray2 = "[ ";
        NoLista aux = first;
        while (aux != null){
            myarray2 += aux.getInfo();
            if (aux.getNext() != null){
                myarray2 += "; ";
            }
            aux = aux.getNext();
        }
        myarray2 += " ]";
        return myarray2;

    }


}
