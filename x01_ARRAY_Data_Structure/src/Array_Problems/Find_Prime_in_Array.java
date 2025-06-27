package Array_Problems;

import java.util.Scanner;

public class Find_Prime_in_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size of array: ");
		int n = scan.nextInt();	
		
		int[] arr = new int[n];
		
		System.out.println("Enter The array Elements: ");
//		taking user input of  storing them in array
		for(int i = 0; i <= arr.length -1 ; i++)
		{
			arr[i] = scan.nextInt();
		}
	
	}
	
	static void printPrime(int arr[]) {
		System.out.println("Prime Numbers are : ");
		for(int i = 0; i <= arr.length -1 ; i++)
		{
			int count = 0;
			for(int j = 0; j <= arr[i]; j++) {
				
			}
			
		}
	}

}
