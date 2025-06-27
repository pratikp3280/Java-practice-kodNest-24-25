import java.util.Scanner;
public class GCD_By_Eucledian_logic {

	public static void main(String[] args) {
	
		   
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two numbers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Finding the GCD using the Euclidean algorithm
        int gcd = findGCD(num1, num2);

        // Output the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);

        // Close the scanner
        scanner.close();
    }

    // Method to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) { // Continue until the second number becomes zero
            int temp = b; // Save the current value of b
            b = a % b;    // Update b to the remainder of a divided by b
            a = temp;     // Update a to the old value of b
        }
        return a; // a now contains the GCD
    }
		


	

}
