package set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    private Set<Contact> contactSet;

    public ContactBook() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int number){
        contactSet.add(new Contact(name, number));
    }

    public void displayContact(){
        System.out.println(contactSet);
    }
    public Set<Contact> searchByName(String name){
        Set<Contact> contactsByName = new HashSet<>();
        for (Contact c: contactSet){
            if (c.getName().startsWith(name)){
                contactsByName.add(c);
            }
        }
        return contactsByName;
    }

    public Contact updateNumberContact(String name, int newNumber){
        Contact updateContact = null;
        for (Contact c: contactSet){
            if (c.getName().equalsIgnoreCase(name)){
                c.setNumber(newNumber);
                updateContact = c;
                break;
            }
        }
        return updateContact;
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.displayContact();

        contactBook.addContact("Renan", 12345678);
        contactBook.addContact("Maria", 12345679);
        contactBook.addContact("Maria da silva", 12345677);
        contactBook.addContact("Maria meddeiros", 12345676);
        contactBook.addContact("Carlos", 12345675);
        contactBook.displayContact();

        System.out.println(contactBook.searchByName("Maria"));

        contactBook.updateNumberContact("Renan", 40028922);
        contactBook.displayContact();
    }
}
