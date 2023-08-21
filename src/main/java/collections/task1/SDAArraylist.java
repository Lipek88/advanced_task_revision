package collections.task1;

public class SDAArraylist <T>{

    public Object[] arrayList;
    public static final int initialSize = 5;

    public SDAArraylist() {
        arrayList = new Object[initialSize];
    }

    public T get(int index){
        if(index < 0 || index >= initialSize){
            throw new IndexOutOfBoundsException("out of bound");
        }
        return (T) arrayList[index]; // trzeba zrzutować na T
    }
}
