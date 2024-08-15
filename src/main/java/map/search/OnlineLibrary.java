package map.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineLibrary {
    private Map<String, Book> books;

    public OnlineLibrary() {
        this.books = new HashMap<>();
    }

    public void addBook(String link, Book book){
        books.put(link, book);
    }

    public void removeBook(String title){
        List<String> keysToRemove = new ArrayList<>();
        for (Map.Entry<String, Book> entry: books.entrySet()){
            if (entry.getValue().getTitle().equalsIgnoreCase(title)){
                keysToRemove.add(entry.getKey());
            }
        }
        for (String key: keysToRemove){
            books.remove(key);
        }
    }
}
