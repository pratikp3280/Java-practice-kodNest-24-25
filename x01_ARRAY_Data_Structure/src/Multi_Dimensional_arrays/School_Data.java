package Multi_Dimensional_arrays;

import java.util.Scanner;

public class School_Data {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of School: ");
		int row = scan.nextInt();
		
//		System.out.println("Enter the Number of Laptops in Each Shop: ");
//		int col = scan.nextInt();
		
		
		double[][] arr = new double[row][];
		
		System.out.println("Enter the Number of Classes in Each School: ");
		for(int i = 0; i < row; i++) {
			
			arr[i] = new double[scan.nextInt()];
		}
//		arr[0] = new double[4];    // No of cols in 0th row
//		arr[1] = new double[2];	   // No of cols in 1th row
//		arr[2] = new double[3];		// No of cols in 2th row
//		arr[3] = new double[5];		//No of cols in 3th row
		
		//Taking user input Values of Matrix-2D array
		for (int i = 0; i < arr.length; i++) { 				// Iterates through rows
			for (int j = 0; j < arr[i].length; j++) {        //Iterates through columns
				
				System.out.print("Enter the Percentage of passing  for the School: " + (i+1) + " class: "+(j+1));
				arr[i][j] = scan.nextDouble();
			}
			
		}
		
		//Printing array Elements
		System.out.println("The Passing percentage of Each class  are : " );
		
		for (int i = 0; i < arr.length; i++) { // Iterates through rows
			System.out.println("For School " + (i+1)+ ": ");
			for (int j = 0; j < arr[i].length; j++) {        //Iterates through columns
				
				System.out.print(arr[i][j] + "%  ");
			}
			System.out.println();
		}
	
		scan.close();
	}

}