package A_Types_Arrays_Creation;

import java.util.Scanner;

public class Merged_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n  = scan.nextInt();
		int [] arr1 = new int[n];
		
		System.out.println("Enter the size of array: ");
		int m  = scan.nextInt();
		int [] arr2 = new int[m];
		
//		taking user input of  arry1 and storing them in array
		for(int i = 0; i <= arr1.length -1 ; i++)
		{
			System.out.println("Enter the arry1 elements: " );
			arr1[i] = scan.nextInt();
		}
		
//		taking user input of  arry1 and storing them in array
		for(int i = 0; i <= arr2.length -1 ; i++)
		{
			System.out.println("Enter the arry2 elements: " );
			arr2[i] = scan.nextInt();
		}
		
		
//     Merged array
		int[] arr3 = new int[arr1.length + arr2.length];
		
		for(int i=0; i<arr1.length ; i++) {
		
				     arr3[i] = arr1[i];
		}
		
		for(int i = arr1.length; i < arr3.length ; i++) {
				
			          arr3[i] = arr2[i - arr1.length];
			          
			}
		
		System.out.println("Merged array elemnts are: ");
		System.out.print("{ ");
		for(int i = 0; i < arr3.length; i++) {
			
			System.out.print( arr3[i] + " ");
		}
		
		System.out.print(" }");

	}
	

}
