package generic_type.task3;

public class ArrayTask3<T> {
    public static <T> T[] swap (T[] tableToSwap, int startPoint, int endpoint ){
        T a = tableToSwap[startPoint];
        tableToSwap[startPoint] = tableToSwap[endpoint];
        tableToSwap[endpoint] = a;
        return tableToSwap;
    }

}

