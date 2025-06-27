import java.util.Scanner;

public class FirstCharacterUsingArray {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String userInput = sc.nextLine(); // Read user input

        char result0 = firstChar_usingArray(userInput); // Call the method
        System.out.println("First character:(Returned from array Logic method) " + result0);
        System.out.println("");
        
        char result1 = firstChar_usingNormal(userInput); // Call the method
        System.out.println("First character:(Returned from Normal(str.charAt(0)) Logic method) " + result1);
        System.out.println("");
        
        char result2 = firstChar_usingSplit(userInput); // Call the method
        System.out.println("First character:(Returned from Normal(str.charAt(0)) Logic method) " + result2);
        sc.close();
    }
    
    // Static method to get the first character using an array
    public static char firstChar_usingArray(String input) {
        char[] charArray = input.toCharArray(); // Convert string to character array
        return charArray[0]; // Return the first character
    }
    
 // Directly access the first character using .charAt(0)
    public static char firstChar_usingNormal(String str) {
        return str.charAt(0); 
    }
    
    
  // Logic Using split Method:
    public static char firstChar_usingSplit(String str) {
        String[] parts = str.split(""); // / Split the string into individual characters
        return parts[0].charAt(0); // Access the first character from the first part
    }
}


