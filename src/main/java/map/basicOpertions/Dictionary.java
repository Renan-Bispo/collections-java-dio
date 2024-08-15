package map.basicOpertions;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public void removeWord(String word) {
        if (!dictionary.isEmpty()) {
            dictionary.remove(word);
        }
        System.out.println("Dicionario vazio");
    }

    public void displayWord() {
        if (!dictionary.isEmpty()){
            System.out.println(dictionary);
        } else {
            System.out.println("Dicionario vazio");
        }
    }

    public String searchByWord(String word) {
        String definition = dictionary.get(word);
        if (definition != null) {
            return definition;
        }
        return "Palavra não encontrada";
    }


    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("Java", "Linguagem de programação POO");
        dictionary.addWord("Postgres", "Interface de banco de dados SQL");
        dictionary.addWord("Docker", "Sistema de conteneirização");
        dictionary.addWord("Spring boot", "Framewoork Java e Kotlin para realização de tarefas");
        dictionary.displayWord();

        dictionary.removeWord("Docker");
        dictionary.displayWord();

        System.out.println(dictionary.searchByWord("csharp"));

    }
}
