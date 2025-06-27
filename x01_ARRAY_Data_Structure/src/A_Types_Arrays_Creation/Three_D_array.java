package A_Types_Arrays_Creation;

import java.util.Scanner;

public class Three_D_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of blocks: ");
		int block = scan.nextInt();
		System.out.println("Enter the Number of rows: ");
		int row = scan.nextInt();
		System.out.println("Enter the Number of items for all cols: ");
		int col = scan.nextInt();
		
		int[][][] matrix = new int[block][row][col];
		
		
		//Taking user input Values of Matrix-2D array
		for (int i = 0; i < matrix.length; i++) { // Iterates through rows
			for (int j = 0; j < matrix[i].length; j++) {        //Iterates through columns
				for(int k = 0; k < matrix[i][j].length; k++) {			
					matrix[i][j][k] = scan .nextInt();
			}
			}
		}
		
		//Printing array Elements using For each loop
		
		
		for (int[][] rows : matrix) { // Iterates through rows
			System.out.print("[");
			for (int[] cols : rows) {        //Iterates through columns
				System.out.print("[");
				for(int item : cols) {
				System.out.print(item + " ");
				}
				
				System.out.println();
			}
			System.out.print("]");
			System.out.println();
		}
	
		scan.close();
	}

}