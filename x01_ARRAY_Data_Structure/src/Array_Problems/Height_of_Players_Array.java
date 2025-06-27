package Array_Problems;

import java.util.Scanner;

public class Height_of_Players_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of Players: ");
		int n  = scan.nextInt();
		float [] arr = new float[n];
		
//		taking user input of Player Heights and storing them in array
		for(int i = 0; i <= arr.length -1 ; i++)
		{
			System.out.println("Enter the height of the  Student " + (i+1));
			arr[i] = scan.nextFloat();
		}
		
//		Printing all the Player Heights
		for(int i = 0; i <= arr.length -1 ; i++)
		{
			System.out.println("The Height for Player " + (i+1) + " is: " + arr[i] );
		}

	}

}
