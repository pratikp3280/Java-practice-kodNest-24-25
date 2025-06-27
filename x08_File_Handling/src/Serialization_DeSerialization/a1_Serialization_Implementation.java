package Serialization_DeSerialization;

import java.io.*;


// Step 1: Create a Serializable class
class Student implements Serializable {
    int id;
    String name;
    transient int age;     // Fields marked as transient are not serialized

    Student(int id, String name , int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class a1_Serialization_Implementation {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", 25);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(s1);
            System.out.println("✅ Object Serialized Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Serialization : process of converting an object into a byte stream so that it can be:
									Stored in a file,
									Sent over a network,
									Saved to a database, or
									Cached in memory.
saving object state to file/database
*/

