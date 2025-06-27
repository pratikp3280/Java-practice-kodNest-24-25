package Multi_Dimensional_arrays;

import java.util.Scanner;
public class Company_Employee_Details {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the Number of Companies: ");
			int row = scan.nextInt();
			System.out.println("Enter the Number of Employees in Each Companies: ");
			int col = scan.nextInt();
			
			String[][] matrix = new String[row][col];
			
			
			//Taking user input Values of Matrix-2D array
			for (int i = 0; i < matrix.length; i++) { 				// Iterates through rows
				for (int j = 0; j < matrix[i].length; j++) {        //Iterates through columns
					
					matrix[i][j] = scan.next();
				}
			}
			
			
			
			//Printing array Elements
			for (int i = 0; i < matrix.length; i++) { // Iterates through rows
				System.out.print("Company Employees: [");
				for (int j = 0; j < matrix[i].length; j++) {        //Iterates through columns
					
					System.out.print(matrix[i][j]+ " ");
					
				}
				System.out.print("]");
				System.out.println();
			}
		
			scan.close();
		}

	}

