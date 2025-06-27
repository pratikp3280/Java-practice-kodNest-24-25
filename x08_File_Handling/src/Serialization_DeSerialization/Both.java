package Serialization_DeSerialization;

import java.io.*;

// Step 1: Create a Serializable class
class Employee implements Serializable {

	//Used to track version of class definition during serialization
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    transient double salary; // This field will NOT be serialized due to `transient`

    // Constructor to initialize object
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Both {
    public static void main(String[] args) {

        // Step 2: Create an object of Employee
        Employee emp = new Employee(101, "Alice", 75000.50);

        // ------------------ Serialization ------------------
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            
        	// Serialize the object and write it to a file
            out.writeObject(emp);
            System.out.println("✅ Serialization done: Object saved to employee.ser");
        } 
        catch (IOException e) {
            System.out.println("❌ Error during serialization: " + e);
        }

        
        
        
        // ------------------ Deserialization ------------------
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {

            // Read object from file and cast it
            Employee deserializedEmp = (Employee) in.readObject();

            // Display deserialized object data
            System.out.println("✅ Deserialization done. Reconstructed object(From bytes into Object):");
            System.out.println("ID: " + deserializedEmp.id);
            System.out.println("Name: " + deserializedEmp.name);
            System.out.println("Salary: " + deserializedEmp.salary); // Should print 0.0 due to transient
        } 
        catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error during deserialization: " + e);
        }
    }
}

 
 
 
 /* 
  * You’re packing a toy robot (object) into a box (serialization) to ship to a friend.
Your friend receives the box and unpacks it (deserialization) to get the same toy robot.
This way:
			Serialization = Packing( Object => byte stream)
			Deserialization = Unpacking ( byte => Object )
  * */
