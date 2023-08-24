package generic_type.task4;

public class Task$Demo {
    public static void main(String[] args) {
        Library<Book> books = new Library<>(
                new Book[]
                        {new Book("title1", "author1"),
                                new Book("title2", "author2")});

        Library<Car> cars = new Library<>(
                new Car[]{
                        new Car("red")
                });
    }
}
