package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of n array: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter space seperated values: ");
		String inputLine = sc.nextLine();
		
		// Splitting based on extra whitespace,newline,tab ....
        String[] strArray = inputLine.split("\\s+"); 
		
        int[] arr = new int[n];  // Creating integer array of given size
        
        // converting  into integer type array
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArray[i]);  
        }     
        
        
        System.out.println("Array After sorting(Ascending)");
        BubbleSort_Ascending(arr).toString();
        for(int x : arr) {
        	System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("Array After sorting(descending)");
        BubbleSort_descending(arr).toString();
        for(int x : arr) {
        	System.out.print(x + " ");
        }
        
        
  }
	
	public static int[] BubbleSort_Ascending(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i <= n - 2 ; i++) {
			for(int j = 0 ; j <= (n-2-i); j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	
	public static int[] BubbleSort_descending(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i <= n - 2 ; i++) {
			for(int j = 0 ; j <= (n-2-i); j++) {
				
				if(arr[j] < arr[j+1]) {
					
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
}