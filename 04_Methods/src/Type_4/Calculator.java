package Type_4;
//Methods with Parameters and with Return Values
public class Calculator {
	int addNumbers(int a, int b) { // Method with parameters and with return value
        return a + b; // Return the sum of the numbers
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.addNumbers(10, 20); // Call the method with arguments
        System.out.println("Sum: " + result);
    }

}
