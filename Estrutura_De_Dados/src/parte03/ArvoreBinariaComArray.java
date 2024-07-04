package parte03;

public class ArvoreBinariaComArray {

    private int h = -1;
    private int counter;
    private Integer array[];

    public ArvoreBinariaComArray(int h){
        array = new Integer[getQtMaxNodes()];
        counter = 0;
        this.h = h;
    }
    public boolean add(Integer element){
        return false;
    }
    public boolean add(int h, Integer element){
        return false;
    }
    public boolean remove(int h){
        return false;
    }
    public boolean contains(Integer element){
        return false;
    }
    public boolean isEmpty(){
        return false;
    }
    public boolean isFull(){
        return false;
    }
    public int getHeight(){
        return 0;
    }
    public int getNodeLevel(Integer element){
        return 0;
    }
    private int getQtMaxNodes(){
        return (int) (Math.pow(2, h+1)-1);
    }
    public int size(){
        return 0;
    }
    public void clear(){

    }
    @Override
    public String toString(){
        return "";
    }
    public String toStringPreOrdem(){
        return "";
    }
    public String toStringInOrdem(){
        return "";
    }
    public String toStringPosOrdem(){
        return "";
    }

}
