package Linear_Search;

import java.util.Scanner;

public class Find_Largest_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of n array: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter space-separated values: ");
        String inputLine = sc.nextLine();

        // Split the string into individual numbers 
        String[] strArray = inputLine.split("\\s+"); // Splitting based on extra whitespace,newline,tab ....
       

       // converting  into integer type array
        int[] arr = new int[n];  // Creating integer array of given size
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArray[i]);  // Convert string to int
        }
        
        int result = findLargestNum(arr);
        System.out.println("The Largest Number in the Array is : " + result );
        
	}
	
	

	public static int findLargestNum(int[] arr) {
		int largest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
            	largest = arr[i];
            }
            
        }
		return largest;
		
	}

}
