import java.util.Scanner;
public class Bianry {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a decimal number: ");
	        int decimalNumber = scanner.nextInt(); // Take input
	        scanner.close();

	        String binary = "#"; // Initialize an empty string to store the binary equivalent

	        int number = decimalNumber; // Preserve the original number for display
	        while (number > 0) {
	            int remainder = number % 2; // Get the remainder (0 or 1)
	            binary = binary + remainder; // Append the remainder at the front of the binary string
	            number = number / 2; // Divide the number by 2 for the next iteration
	            
	            System.out.println("binary:" + binary );
	        }

	        System.out.println("The binary equivalent of " + decimalNumber + " is: " + binary);
	    }
	}

//  string  n = "P";
//  string  rem = "R";
//
// string add = sop (n+rem)  // PR
//
