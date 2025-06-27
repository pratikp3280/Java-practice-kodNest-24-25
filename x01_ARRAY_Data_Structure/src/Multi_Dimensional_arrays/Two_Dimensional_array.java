package Multi_Dimensional_arrays;

import java.util.Scanner;

public class Two_Dimensional_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of Rows: ");
		int row = scan.nextInt();
		System.out.println("Enter the Number of Columns: ");
		int col = scan.nextInt();
		
		int[][] matrix = new int[row][col];
		
		
		//Taking user input Values of Matrix-2D array
		for (int i = 0; i < matrix.length; i++) { // Iterates through rows
			for (int j = 0; j < matrix[i].length; j++) {        //Iterates through columns
				
				matrix[i][j] = scan.nextInt();
			}
			
		}
		
		//Printing array Elements
		
		
		for (int i = 0; i < matrix.length; i++) { // Iterates through rows
			System.out.print("[");
			for (int j = 0; j < matrix[i].length; j++) {        //Iterates through columns
				
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.print("]");
			System.out.println();
		}
	
		scan.close();
	}

}
