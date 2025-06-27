package Intro;

import java.util.Scanner;

public class Ex_Without_try_Catch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Division Program Started");
		
		System.out.println("Enter the First Number: ");
		 double  num1=  scan.nextDouble();
		
		System.out.println("Enter the Second Number: ");
		int num2 = scan.nextInt();
		
		double result = num1 / num2;
		
		System.out.println("The Division of two numbers is : " + result );
		System.out.println("Division Program Ended");
		
//		String str = null; 
//		System.out.println(str.length());
		
		int[] arr = {1, 2};
		System.out.println(arr[5]);
		
// Here Error(Exception ) will occcur Due to 10 / 0 is Not Possible
		
		//ArithmeticException:-
/*	Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at Intro.Ex_Without_try_Catch.main(Ex_Without_try_Catch.java:17)
	    
	    //InputMismatchException:-
	Exception in thread "main" java.util.InputMismatchException
		at Intro.Ex_Without_try_Catch.main(Ex_Without_try_Catch.java:12)

		//NullPointerException:-
 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
	at Intro.Ex_Without_try_Catch.main(Ex_Without_try_Catch.java:23)
	
 
	*/
	}

}
