package Binary_Search;

import java.util.Scanner;

public class Find_throgh_Binary_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of n array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the key to find: ");
		int key = sc.nextInt();
		
		// Create an array to hold the scores
        int[] arr = new int[n];

        // Ask the user to enter the scores
        String inputLine = sc.nextLine();
        String[] inputStrings = inputLine.trim().split("\\s+");

        // Convert the array of strings to an array of integers
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputStrings[i]);
        }
		
	
		
		int low = 0 , high = arr.length-1 ;
		while(high >= low) {
			
			int mid = (low + high)/2 ;
			
			if(key == arr[mid]) {
				System.out.println("Key Found at index: " + mid);
				return;
			}
			else if(key > arr[mid]) {
				low = mid + 1;
				high = high;
				
			}
			else{
				low = low;
				high = mid -1;
			}
		}
		System.out.println("Key NOT Found ");
		

	}

}
