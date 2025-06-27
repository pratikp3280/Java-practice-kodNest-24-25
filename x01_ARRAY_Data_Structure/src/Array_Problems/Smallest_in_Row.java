package Array_Problems;

import java.util.Scanner;

public class Smallest_in_Row {
    

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask the user for the number of rows and columns
        System.out.println("Enter the number of rows:");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scan.nextInt();

        
        int[][]array = new int[rows][cols];

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

        
        int sum = 0;
        //  Finding and print the Minimum value of each row
        for (int i = 0; i < array.length; i++) {
        	int min = array[i][array[i].length-1];                                  //or array[i][0]
        	
            for (int j = 0; j < array[i].length; j++) {
            	
                if(array[i][j] < min) {
                	min = array[i][j];
                	
                }
                sum = sum + min;           //Storing sum of smallest values
                
            }
          
			System.out.println("The Smallest element of row-" + (i + 1) + " is : " + min);
			
        }
        double avg = (sum /(rows));
        System.out.println("The avrage of all smallest element is : " + avg);

        scan.close();
    }
}
