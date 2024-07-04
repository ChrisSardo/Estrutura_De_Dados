package parte03;

import java.util.ArrayList;
import java.util.logging.XMLFormatter;


public class ListaComArray {

    private Integer[] array;
    private boolean resizable;
    private int initialCapacity;
    private int counter;
    private final static int X = 10;

    public ListaComArray(){
        this(10);
    }
    public ListaComArray(int initialCapacity){
        this(initialCapacity,true);
    }
    public ListaComArray(int initialCapacity, boolean resizable){
        this.initialCapacity = initialCapacity;
        this.resizable = resizable;
        this.counter = 0;
        this.array = new Integer[initialCapacity];
    }

    public boolean add(Integer element){
        if (counter == array.length){
            if(resizable){
                resizeArrayList();
            } else{
                return false;
            }
        }
        array[counter] = element;
        counter++;
        return true;
    }

    public boolean add(int index, Integer element){
        if(index < 0 || index > counter){
            return false;
        }
        if (counter == array.length){
            if(resizable){
                resizeArrayList();
            } else{
                return false;
            }
        }
        for(int i = counter; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = element;
        counter++;
        return true;
    }

    private void resizeArrayList(){
        Integer[] novo = new Integer[array.length + X];
 /*for(int i = 0; i < array.length; i++){
 novo[i] = array[i];
 }*/
        System.arraycopy(array, 0, novo, 0, array.length);
        array = novo;
    }
    public Integer remove(int index){
        return 1;
    }
    public boolean removeFirst(Integer element){
        return false;
    }
    public Integer get(int index){
        return 1;
    }
    public void clear(){
        if(resizable){
            array = new Integer[initialCapacity];
        }
        counter = 0;
    }
    public Integer set(int index, Integer element){
        return 1;
    }
    public int size(){
        return counter;
    }
    public boolean isEmpty(){
        return (counter == 0);
    }
    public boolean isFull(){
        if (!resizable){
            return (counter == array.length);
        }
        return false;
    }
    public int contains(Integer element){
        return 1;
    }
    public int lastIndexOf(Integer element){
        return 1;
    }
    public Integer[] toArray(){
        return null;
    }
    public String toString(){
        String myarray1 = "[";
        for(int i = 0; i < counter; i++){
            if(i !=(counter-1)){
                myarray1 += array[i] + ", ";
            }else {
                myarray1 += array[i] + "] ";
            }
        }
        String myarray2 = "[";
        for (int i = 0; i < array.length; i++){
            if (i !=(array.length-1)){
                myarray2 += array[i] + ", ";
            }else {
                myarray2 += array[i] + "] ";
            }
        }
        return "###\n" + myarray1 + "\n" + myarray2;
    }


}
