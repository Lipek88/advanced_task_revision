package generic_type.task2;

public class Task2Demo {
    public static void main(String[] args) {
        Integer[] integerTable = {1, 2, 3, 4, 5};

        int count = Task1.countIf(integerTable, value -> value > 3);
        System.out.println(count);
    }

}
