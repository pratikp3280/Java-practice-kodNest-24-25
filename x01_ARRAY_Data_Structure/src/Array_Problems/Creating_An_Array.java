package Array_Problems;

import java.util.Scanner;

public class Creating_An_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of Students: ");
		int n  = scan.nextInt();
		int [] arr = new int[n];
		
		
//		taking user input of  marks and storing them in array
		for(int i = 0; i <= arr.length -1 ; i++)
		{
			System.out.println("Enter the marks of Student " + (i+1));
			arr[i] = scan.nextInt();
		}
		
//		Printing all the Student MARKS 
		for(int i = 0; i <= arr.length -1 ; i++)
		{
			System.out.println("The Marks for student " + (i+1) + " is: " + arr[i] );
			
		}
		
		

	}

}
