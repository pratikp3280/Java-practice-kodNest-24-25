package Array_Problems;

import java.util.Scanner;
public class Transpose_of_Matrix {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Step 1: Get matrix dimensions from user
		        System.out.print("Enter number of rows: ");
		        int rows = scanner.nextInt();
		        
		        System.out.print("Enter number of columns: ");
		        int cols = scanner.nextInt();

		        // Step 2: Create and populate the matrix
		        int[][] matrix = new int[rows][cols];
		        
		        System.out.println("Enter matrix elements row-wise:");
		        for (int i = 0; i < rows; i++) {     //Outer Loop through rows
		            for (int j = 0; j < cols; j++) { //Inner Loop through columns
		                matrix[i][j] = scanner.nextInt();
		            }
		        }

		        // Step 3: Create a new matrix to store the transpose
		        int[][] transpose = new int[cols][rows];

		        // Step 4: Compute the transpose by swapping rows and columns
		        for (int i = 0; i < rows; i++) { 
		            for (int j = 0; j < cols; j++) {
		                transpose[j][i] = matrix[i][j]; // Swap elements  
		            }
		        }

		        // Step 5: Printing the original matrix
		        System.out.println("Original Matrix:");
		        printMatrix(matrix, rows, cols);           //calling printMatrix and passing parameters 

		        // Step 6: Print the transposed matrix
		        System.out.println("Transpose of the Matrix:");
		        printMatrix(transpose, cols, rows);		  //calling printMatrix and passing parameters 

		        scanner.close();
		    }

		    // Helper method(---------printMatrix()------) to print a matrix
		    public static void printMatrix(int[][] matrix, int rows, int cols) {
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println(); // New line after each row
		        }
		    }
		}
