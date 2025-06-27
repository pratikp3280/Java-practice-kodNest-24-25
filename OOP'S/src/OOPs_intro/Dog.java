package OOPs_intro;

//Blueprint for Dog class
class Dog {
 // Attributes (state of the dog)
 private String breed;  // Private access modifier
 private String color;
 private int age;

 // Default Constructor
 public Dog() {
     this.breed = "Unknown"; // Using 'this' keyword
     this.color = "Unknown";
     this.age = 0;
 }

 // Parameterized Constructor
 public Dog(String breed, String color, int age) {
     this.breed = breed;
     this.color = color;
     this.age = age;
 }

 // Getter and Setter for breed
 public String getBreed() {
     return breed;
 }

 public void setBreed(String breed) {
     this.breed = breed;
 }

 // Getter and Setter for color
 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 // Getter and Setter for age
 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 // Behavior (Methods)
 public void bark() {
     System.out.println(breed + " is barking!");
 }

 public void run() {
     System.out.println(color + " dog is running.");
 }

 // Method to display dog details
 public void displayDetails() {
     System.out.println("Breed: " + breed + ", Color: " + color + ", Age: " + age + " years");
 }
}



