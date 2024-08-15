package map.basicOpertions;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    private Map<String, Integer> contact;

    public ContactBook() {
        this.contact = new HashMap<>();
    }

    public void addContact(String name, Integer number) {
        contact.put(name, number);
    }

    public void removeContact(String name) {
        if (!contact.isEmpty()) {
            contact.remove(name);
        }
    }

    public void displayContact() {
        System.out.println(contact);
    }

    public Integer searchByName(String name) {
        Integer numberByName = null;
        if (!contact.isEmpty()) {
            numberByName = contact.get(name);
            if (numberByName == null) {
                System.out.println("Contato não encontrado");
            }
        } else {
            System.out.println("Agenda de contato está vazia");
        }
        return numberByName;
    }

    public static void main(String[] args) {
        ContactBook contacts = new ContactBook();

        contacts.addContact("Renan", 40028922);
        contacts.addContact("Marta", 00223311);
        contacts.addContact("Wagner", 1235678);

        contacts.displayContact();

        contacts.removeContact("Marta");

        contacts.displayContact();

        String nameSearch = "Renan";
        Integer searchNumber = contacts.searchByName("Renan");
        System.out.println(nameSearch + searchNumber);



    }
}
