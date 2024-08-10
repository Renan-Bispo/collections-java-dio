package list.BasicOperations.library;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> books;

    public BookCatalog(List<Book> books) {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(String title, String author, int yearOfRelease){
        Book book = new Book(title, author, yearOfRelease);
        this.books.add(book);
    }
}

