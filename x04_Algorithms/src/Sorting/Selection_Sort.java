package Sorting;

import java.util.Scanner;

public class Selection_Sort {

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
        
        int[] SortedArray = SelectionSorting_Ascending(arr);
        for(int x : SortedArray) {
        	System.out.print(x + " ");
        }
        System.out.println();
	}
	
	
	public static int[] SelectionSorting_Ascending(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i <= n-2 ; i++) {
			int pos = i;
			int min = arr[pos];
			
			for(int j = i+1 ; j <= n-1; j++) {
				
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			
			
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
			
		}
		
		return arr;
	}
	
	public static int[] SelectionSorting_descending(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i <= n-2 ; i++) {
			int pos = i;
			int min = arr[pos];
			
			for(int j = i+1 ; j <= n-1; j++) {
				
				if(arr[j] > min) {
					min = arr[j];
					pos = j;
				}
			}
			
			
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
			
		}
		
		return arr;
	}

}
