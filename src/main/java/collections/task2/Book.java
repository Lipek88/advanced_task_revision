package collections.task2;

import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book> {

    String title;
    Double price;
    int year;
    List<Author> authorList;

    Genre genre;

    public Book(String title, Double price, int year, List<Author> authorList, Genre genre) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.authorList = authorList;
        this.genre = genre;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", authorList=" + authorList +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && year == book.year && Objects.equals(title, book.title) && Objects.equals(authorList, book.authorList) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, year, authorList, genre);
    }

    /* poniżej różne zapisy tej samej metody
    aby szeregować dane należy implementować interfejs Comparable
    i nadpisać metodę compareTo
    należy pamiętać, że aby ta metoda działała należy mieć dane w typie obiektowym
    inaczej niezbędny będzie zapis jak w linii 112 Integer.compare()
     */

//    @Override
//    public int compareTo(Book o) {
//        return title.compareTo(o.getTitle());
//    }
//
//    @Override
//    public int compareTo(Book o) {
//        return this.title.compareTo(o.getTitle());
//    }

//    @Override
//    public int compareTo(Book o) {
//        return this.getPrice().compareTo(o.getPrice());
//    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.getYear(), o.getYear());
    }


//    @Override
//    public int compareTo(Book o) {
//        return getTitle().compareTo(o.getTitle());
//    }



//    @Override
//    public int compareTo(Book o) {
//        return o.getTitle().compareTo(title);
//    }
}
