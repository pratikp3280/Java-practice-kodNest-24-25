package Comparable_CompareTo;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        
        list.add(new Person("Devid", 24));
        list.add(new Person("Charlie", 22));
        list.add(new Person("Bob", 30));
        list.add(new Person("Alice", 25));
        
        Collections.sort(list); // Uses compareTo() for sorting

        System.out.println("Sorted list(Based on the age): ");
        for (Person person : list) {
            System.out.println(person);
        }
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Ascending order by age
    }

    @Override
    public String toString() {
        return "Person{name=\"" + name + "\", age=" + age + "}";
    }
}


