package OOPs_intro;

//Main class to create and interact with Dog objects
public class Main {
public static void main(String[] args) {
   // Using default constructor
   Dog unknownDog = new Dog();
   System.out.println("Default Constructor:");
   unknownDog.displayDetails();

   // Using parameterized constructor
   Dog buddy = new Dog("Labrador", "Brown", 3);
   System.out.println("\nParameterized Constructor:");
   buddy.displayDetails();

   // Modifying attributes using setter methods
   buddy.setColor("Golden");
   System.out.println("\nAfter modifying color:");
   buddy.displayDetails();

   // Calling behaviors
   buddy.bark();
   buddy.run();
}
}