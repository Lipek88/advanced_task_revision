package example;

public class main {
    public static void main(String[] args) {
        Task task = new Task();
        task.setName("Przemo");
        System.out.println(task.getName());
        System.out.println();
        task.setName("bla");
        System.out.println(task.getName());
    }
}
