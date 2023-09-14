package collections.task2;

import java.util.ArrayList;

public class Task2Demo {
    public static void main(String[] args) {
        Book book = new Book("aaaaaa", 1D, 1, new ArrayList<>(), Genre.COMEDY);
        Book book2 = new Book("bbbbbb", 2D, 2, new ArrayList<>(), Genre.FANTASY);

        BookService bookService = new BookService();
        bookService.add2(book);
        bookService.add2(book2);

        bookService.displayAll();

        System.out.println("*******");

        System.out.println(bookService.displayAll2());

        System.out.println("*******");

        System.out.println(bookService.displayAll3());
        System.out.println(bookService.books.size());

        System.out.println(bookService.getByGenre(Genre.COMEDY));


        System.out.println("++++++++++++");
        System.out.println(bookService.getSortedByTitle());
    }


}
