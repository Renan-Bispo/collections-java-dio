package list.ordering;

import java.util.*;


public class PersonOrdering {
    private List<Person> persons;

    public PersonOrdering() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height){
        persons.add(new Person(name, age, height));
    }

    public List<Person> sortByAge(){
        List<Person> personByAge = new ArrayList<>(persons);
        if (!personByAge.isEmpty()){
            Collections.sort(personByAge);
            return personByAge;
        } else {
            throw new RuntimeException("Lista vázia");
        }
    }

    public List<Person> sortByHeight(){
        List<Person> personByHeight = new ArrayList<>(persons);
        if (!personByHeight.isEmpty()){
            Collections.sort(personByHeight, new Person.CompareByHeight() );
            return personByHeight;
        } else {
            throw new RuntimeException("Lista está vázia");
        }
    }

    public static void main(String[] args) {
        PersonOrdering person = new PersonOrdering();

        person.addPerson("Calebe", 19, 1.66);
        person.addPerson("João", 47, 1.50);
        person.addPerson("Marta", 17, 1.55);
        person.addPerson("Renato", 50, 1.60);

        System.out.println(person.sortByHeight());

        System.out.println(person.sortByAge());
    }
}
