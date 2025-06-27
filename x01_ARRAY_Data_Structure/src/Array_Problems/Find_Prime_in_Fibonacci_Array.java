package Array_Problems;

import java.util.Scanner;

public class Find_Prime_in_Fibonacci_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number of Fibonacci Terms: ");
		int N = scan.nextInt();	
		
		int[] arr = new int[N];
		
		fibArray(arr);
		
		

	}
	
	static void fibArray(int[] arr) {
		
		int fib1 = 0;        //fibonacci first term
		int fib2 = 1;		 //fibonacci second term
		
		arr[0] = fib1;
		arr[1] = fib2;
		
		for(int i =2 ; i <= arr.length-1 ; i++){
			int fib3 = fib1 + fib2;            //Calculating the Next term
			fib1  = fib2;						// Updating a and b after every Term Printing
			fib2 =  fib3;
			
			arr[i] = fib3;
		}
		
		System.out.println("The array elemnts are:");
		System.out.print("[");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.print("]");
    	
		
		
		
	}
	
}
