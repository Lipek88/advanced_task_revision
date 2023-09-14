package collections.task2;

import java.util.*;

public class BookService {

    List<Book> books = new ArrayList<>();

    public BookService() {
    }

    public BookService(List<Book> books) {
        this.books = books;
    }

    public void addBook(List<Book> books, Book book){
        books.add(book);
    }

    public void add2(Book book){
        books.add(book);
    }

    public void remove(Book book){
        books.remove(book);
    }

    public void displayAll(){
        books.forEach(System.out::println);
    }

    public List<Book> displayAll2(){
        return books;
    }

    public BookService displayAll3(){
        return this;
    }

    public List<Book> getByGenre(Genre genre){
        List<Book> newListByGenre = new ArrayList<>();
        for(Book book : books){
            if (book.getGenre() == genre){
                newListByGenre.add(book);
            }
        }
        return newListByGenre;
    }

    public List<Book> getSortedByTitle(){
        Collections.sort(books);
        return books;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "books=" + books +
                '}';
    }
}
