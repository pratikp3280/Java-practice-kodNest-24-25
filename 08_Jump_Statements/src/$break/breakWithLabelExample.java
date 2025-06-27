package $break;

import java.util.Scanner;

public class breakWithLabelExample {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	 System.out.println("Enter Your target element: ");
    	 int target = scan.nextInt();
    	 scan.close();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
       
        boolean found = false;

        // Label for the outer loop
        search:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Target " + target + " found at position: (" + i + ", " + j + ")");
                    found = true;
                    break search; // Exit both loops
                }
            }
        }

        if (!found) {
            System.out.println("Target " + target + " not found in the matrix.");
        }
    }
}

