package Method_Types;

//Return Methods: Perform an action and return a value.
public class returnTypeMethod {

	//Method Calling inside Main Method
	public static void main(String[] args) {
		returnTypeMethod calc = new returnTypeMethod();
        int result = calc.addNumbers(5, 10);   //arguments
        System.out.println("Sum: " + result);

	}
	
	//Method Definition with Parameters
	int addNumbers(int a, int b) {
        return a + b;     //returns an int value
    }

}
