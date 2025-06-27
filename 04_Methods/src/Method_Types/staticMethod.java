package Method_Types;

//Static Methods: Can be called without creating an object of the class.
public class staticMethod {

	
	//Static method Calling
	public static void main(String[] args) {
		staticMethod.displayMessage(); // No object required
	}
	
	
	//Static method Definition
	static void displayMessage() {
        System.out.println("This is a static method.");
        // no return value
    }
	

}
