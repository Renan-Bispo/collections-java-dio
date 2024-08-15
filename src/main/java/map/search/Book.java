package map.search;

import java.util.Comparator;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

class CompareByPrice implements Comparator<Map.Entry<String, Book>>{

    @Override
    public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
        return Double.compare(b1.getValue().getPrice(), b2.getValue().getPrice());
    }
}

class CompareByAuthor implements Comparator<Map.Entry<String, Book>>{

    @Override
    public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
        return b1.getValue().getAuthor().compareToIgnoreCase(b2.getValue().getAuthor());
    }
}