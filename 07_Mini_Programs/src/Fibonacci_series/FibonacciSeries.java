package Fibonacci_series;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number of Terms in fibonacci Series: ");
		
		int N = scan.nextInt();					//Getting the user input and Storing it in variable N
		
		int a = 0 , b = 1 ;                 	// initializing the First Two Numbers as zero and one
		
		System.out.println("Here is Your Fibonacci Series: ");
		
		for(int i =1 ; i<= N ; i++){
			
			System.out.println(a + " ");    // Printing the First Fibonacci term (Third term)
			
			int nextTerm = a + b;          //Calculating the Next term
			
			a = b ;						// Updating a and b after every Term Printing
			b = nextTerm;
			
			
			
		}
		scan.close();
		
		
	}

}
