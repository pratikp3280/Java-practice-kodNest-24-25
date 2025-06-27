package Array_Problems;

import java.util.Scanner;

public class Average_of_Each_Row {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        // Ask the user for the number of rows and columns
	        // System.out.println("Enter the number of rows:");
	        int rows = scan.nextInt();
	        // System.out.println("Enter the number of columns:");
	        int cols = scan.nextInt();

	        //  Create a 2D array of integers
	        int[][] array = new int[rows][cols];

	        //  Populate the array with user-input values
	        for (int i = 0; i < array.length ; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                array[i][j] = scan.nextInt();
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

	        //  Calculate and print the average of each row
	        for (int i = 0; i < array.length; i++) {
	            int sum = 0;
	            for (int j = 0; j < array[i].length; j++) {
	                sum += array[i][j];
	            }
	            double average = (double) sum / cols;
	            System.out.println("Average of row " + (i + 1) + ": " + average);
	        }

	        scan.close();
	    }
	}
