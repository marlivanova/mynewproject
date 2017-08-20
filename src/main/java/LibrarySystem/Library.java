package LibrarySystem;

import java.awt.print.Book;

/**
 * Created by kisik on 20.08.2017.
 */
public class Library {
    private Book books[] = new Book[30];
    private int currIdx = 0;

    public int addBook(Book book) {
        books[] currIdx = book;
        currIdx += 1;
        System.out.println("book" + book.getTitle() + "added");
        return currIdx - 1;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public Book getBookByTitle(String title) {

        Book foundBook = null;

        for (Book books) {
            if (book.equals(title) == true) {
                foundBook = book;
                break;
            }
            return foundBook;
        }
    }
}
