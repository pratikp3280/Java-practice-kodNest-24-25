import java.util.Scanner;
public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number of Terms in fibonacci Series: ");
		long N = scan.nextLong();	//Getting the user input and Storing it in variable N
		
		long num1 = 0;        //fibonacci first term
		long num2 = 1;		 //fibonacci second term
		
		System.out.println("Here is Your Fibonacci Series: ");
		System.out.println(num1 + " ");
		System.out.println(num2 + " ");
		
		
    for(int i =3 ; i<= N ; i++){
	
			long num3 = num1 + num2;          //Calculating the Next term
			
			num1  = num2;						// Updating a and b after every Term Printing
			num2 =  num3;
			if(num3<N)
			System.out.println(num3 + " ");    // Printing the First Fibonacci term (Third term)
		}
    	
		scan.close();
		

	}

}
