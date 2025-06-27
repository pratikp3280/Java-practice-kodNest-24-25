package Intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_with_catch_blocks {

	public static void main(String[] args) {
		try {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Please Enter the Number: ");
			int num1 = sc.nextInt();
			System.out.println("Please Enter the Number: ");
			int num2 = sc.nextInt();
			
			int res = num1 / num2;
			System.out.println("Result of Division is :  " + res);
			
			System.out.println("Please Enter the Size of an Array: ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			
			System.out.println(arr[5]);
			
			String[] numbers = {"10", "20" , "Thirty" , "40"};
			int sum = 0;
			for(String  num : numbers ) {
				sum += Integer.parseInt(num);
			}
			
		}
		
		
		
		catch(ArithmeticException ae) {
			System.out.println("Denominator should not be 0!");		
			}
		catch(InputMismatchException ime) {
			System.out.println("Please Enter Integers");	
		}
		catch(NegativeArraySizeException nase) {
			System.out.println("Array Size must be Positive");	
		}
		catch(ArrayIndexOutOfBoundsException aio) {
			System.out.println("Please Enter Array Size >= 5!");	
		}
		catch(NumberFormatException nfe) {
			System.out.println("Invalid Number format for the input " );	
		}
		
		//Backup catch block for Umknown Exceptions
		catch(Exception ex) {
			System.out.println("Some Exception occured!..");	
			ex.printStackTrace();
			
		}
		

	}

}
