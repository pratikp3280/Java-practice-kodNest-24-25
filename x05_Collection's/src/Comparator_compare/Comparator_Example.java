package Comparator_compare;
import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));

        System.out.println("Original List:");
        System.out.println(people);

        // Sorting by Age
        Collections.sort(people, new AgeComparator());
        System.out.println("\nSorted by Age:");
        System.out.println(people);

        // Sorting by Name
        Collections.sort(people, new NameComparator());
        System.out.println("\nSorted by Name:");
        System.out.println(people);
    }
}

//create a Person class and use Comparator to sort by age and name.
public class Comparator_Example {

	class Person {
	    String name;
	    int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // toString() for easy printing
	    @Override
	    public String toString() {
	        return "Person{name=\"" + name + "\", age=" + age + "}";
	    }
	}

// Sorting in Ascending Order

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);  // Sorting in Ascending Order
    }
}
//OR Using Lambda Expressions, we can simplify the code:
// people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));  // Sort by Age

//// Sorting by Name (Alphabetical)
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);  // Sorting by Name (Alphabetical)
    }
}
//OR Using Lambda Expressions, we can simplify the code:
// people.sort((p1, p2) -> p1.name.compareTo(p2.name));  // Sort by Name

//This avoids the need to create a separate Comparator class.
//Collections.sort(people, new Comparator<Person>() {
//    @Override
//    public int compare(Person p1, Person p2) {
//        return p1.age - p2.age;
//    }
// });


//Sorting in Descending Order
//Collections.sort(people, (p1, p2) -> p2.age - p1.age);  // Sort by Age (Descending)


}


