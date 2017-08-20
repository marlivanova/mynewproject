package LibrarySystem;

import java.awt.print.Book;

/**
 * Created by kisik on 20.08.2017.
 */
public class App {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("ogniem i mieczem");
        Book book2 = new Book("pan tadeusz");
        Book book3 = new Book("hobbit;

        int book1idx = Library addBook(book1);
        int book2idx = Library addBook(book2);
        int book3idx = Library addBook(book3);

        System.out.println("now borrowing books");

        Book b1 = Library.getBook(book1idx);
        Book b2 = Library.getBook(book2idx);
        Book b3 = Library.getBook(book3idx);

        System.out.println("borrowed book" + b1.getTitle());
        System.out.println("borrowed book" + b2.getTitle());
        System.out.println("borrowed book" + b3.getTitle());

        Book foundBook = library.getBookByTitle("hobbit");
        if (foundBook != null)
            System.out.println();
        else
            System.out.println("book not found");

    }
}
