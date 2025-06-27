package A_Types_Arrays_Creation;

import java.util.Scanner;

public class Jagged_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of Rows: ");
		int row = scan.nextInt();
		
		int[][] arr = new int[row][];
		
		System.out.println("Enter the Number of columns in Each row: ");
		for(int i = 0; i < row; i++) {
			
			arr[i] = new int[scan.nextInt()];
		}
		
		//Taking user input Values of Matrix-2D array
		for (int i1 = 0; i1 < arr.length; i1++) { 				// Iterates through rows
			for (int j = 0; j < arr[i1].length; j++) {        //Iterates through columns
				
				System.out.print("Enter the value for the Row: " + (i1+1) + " Column: "+(j+1) + " ");
				arr[i1][j] = scan.nextInt();
			}
			
		}
		
		//Printing array Elements using for each loop
		System.out.println("The jagged array elemnts are: " );
		for (int[] rows : arr) {
            for (int ele : rows) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        scan.close();
		
	}
 
}
