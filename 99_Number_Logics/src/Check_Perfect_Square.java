import java.util.Scanner;
public class Check_Perfect_Square {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        
	        
	        int sqrt = (int) Math.sqrt(number);           //gets the Square root of a given Number in Perfect integer 
	       //Condtion whether the given number is Perfect Square or not 
	        if (sqrt * sqrt == number) {
	            System.out.println(number + " is a perfect square.");
	        } else {
	            System.out.println(number + " is not a perfect square.");
	        }
	    }
	

}
