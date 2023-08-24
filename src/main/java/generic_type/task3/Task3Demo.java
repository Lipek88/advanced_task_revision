package generic_type.task3;

public class Task3Demo <t> {
    public static void main(String[] args) {
        Integer[] intArray = {1, 1, 2, 2, 3, 3};
        System.out.println(intArray[0]);
        System.out.println(intArray[5]);
        ArrayTask3.swap(intArray, 0, 5);
        System.out.println(intArray[0]);
        System.out.println(intArray[5]);
    }
}
