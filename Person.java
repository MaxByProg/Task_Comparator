package Test18;

import java.util.Comparator;

/**
 * Created by mbikov on 03.08.2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private String family;

    public Person (String family, String name) {
        this.family = family;
        this.name = name;
    }

    String getName(){ return name; }
    String getFamily() { return family; }

    public int compareTo(Person p) {
        return family.equals(p.family) ? name.compareTo(p.name) : family.compareTo(p.family);
    }


//    public static Comparator<Person> compareTo() {
//        Comparator comp = new Comparator<Person>() {
//            public int compare(Person a, Person b) {
//                if (a.getFamily().compareTo(b.getFamily()) == 0)
//                    return a.getName().compareTo(b.getName());
//                else
//                    return a.getFamily().compareTo(b.getFamily());
//            }
//        };
//        return comp;
//    }
}
