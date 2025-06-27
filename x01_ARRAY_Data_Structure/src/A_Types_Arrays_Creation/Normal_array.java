package A_Types_Arrays_Creation;

import java.util.Scanner;

public class Normal_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of Students: ");
		int n  = scan.nextInt();
		int [] arr = new int[n];
		
		
//		taking user input of  storing them in array
		for(int i = 0; i <= arr.length -1 ; i++)
		{
			System.out.println("Enter the marks of Student " + (i+1));
			arr[i] = scan.nextInt();
		}
		
//		Printing all the elements
		int stud = 0;
		for (int x : arr)
		{
			System.out.println("The Marks for student " + (stud + 1) +" "+ x );
			stud++;
			
		}
		
		

	}

}