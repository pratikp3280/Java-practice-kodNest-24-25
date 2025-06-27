package Array_Problems;

import java.util.Scanner;
public class calculate_SumOfMinElements {
			public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: User input for number of rows and columns
	        System.out.println("Enter the number of rows:");
	        int rows = scanner.nextInt();
	        System.out.println("Enter the number of columns:");
	        int cols = scanner.nextInt();

	        // Step 2: Create and populate the 2D array
	        int[][] array = new int[rows][cols];
	        System.out.println("Enter elements of the array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                array[i][j] = scanner.nextInt();
	            }
	        }
	     // Print the 2D array
	        System.out.println("Array:");
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    	
	        // Step 3: Call method to calculate sum of minimum elements
	        int sumOfMin = calculateSumOfMinElements(array, rows, cols);
	        System.out.println("Sum of minimum elements: " + sumOfMin);

	        scanner.close();
	    }

	    // Method to find the sum of minimum elements from each row
	    public static int calculateSumOfMinElements(int[][] array, int rows, int cols) {
	    	
	    	int sum = 0;
	        System.out.println("Minimum elements of each row:");
	        for (int i = 0; i < rows; i++) {
	            int minElement = array[i][0]; // Assume first element is the minimum
	            for (int j = 1; j < cols; j++) {
	                if (array[i][j] < minElement) {
	                    minElement = array[i][j]; // Update minimum value
	                }
	            }
	            System.out.println("Minimum of row " + (i + 1) + ": " + minElement);
	            sum += minElement;
	        }
	        return sum;
	    }
	}

