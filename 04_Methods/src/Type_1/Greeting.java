package Type_1;
//Methods without Parameters and without Return Values
public class Greeting {
	void displayMessage() { // Method without parameters and without return value
        System.out.println("Welcome to Java Programming!");
    }

    public static void main(String[] args) {
        Greeting greet = new Greeting();
        greet.displayMessage(); // Call the method
    }
}
