package Serialization_DeSerialization;

//import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class a2_DeSerialization {
	
    public static void main(String[] args) {
    	
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s = (Student) in.readObject();
            System.out.println("✅ Object Deserialized: " + s.id + ", " + s.name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

/*
Deserialization : reverse process of serialization
                : reconstructing the original object from the byte stream
           */                                        
