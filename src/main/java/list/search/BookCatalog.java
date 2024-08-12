package list.search;

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

    public List<Book> searchByAtuhor(String author){
        List<Book> searchAutor = new ArrayList<>();
        if(!author.isEmpty()){
            for (Book book : books){
                if (book.getAuthor().equalsIgnoreCase(author)){
                    searchAutor.add(book);
                }
            }
            return searchAutor;
        } else {
            throw new RuntimeException("Livro não econtrado");
        }
    }
}

