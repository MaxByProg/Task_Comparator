package Test18;

import java.util.*;

/**
 * Created by mbikov on 03.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Pipkin", "Rick"));
        persons.add(new Person("Sipkin", "Gike"));
        persons.add(new Person("Mipkin", "Kike"));
        persons.add(new Person("Pipkin", "Morty"));

        Collections.sort(persons);

        for (Person person : persons)
            System.out.println(person.getFamily() + " " + person.getName());
    }
}
