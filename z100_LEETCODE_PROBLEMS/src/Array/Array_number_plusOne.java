package Array;

import java.util.*;
import java.lang.*;

public class Array_number_plusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,9,9};
		int n = arr.length;
		
		
			
		if(arr.length == 0) {
			System.out.println(Arrays.toString(arr));
		}
		else {
		int size = arr.length;
		int number = 0;
		for(int i = 0 ; i < size  ;i++) {
			
			number = (int) (number + (arr[i] * (Math.pow(10 , (size-1-i)))));
			
		}
		
		int new_Number = number + 1;
		arr = numberToArray(new_Number);
		System.out.println(Arrays.toString(arr));

		}
	}
	
	 public static int[] numberToArray(int number) {
	        String str = String.valueOf(number);
	        
	        int[] digitArray = new int[str.length()];

	        for (int i = 0; i < str.length(); i++) {
	            digitArray[i] = Character.getNumericValue(str.charAt(i));
	        }

	        return digitArray;
	    }

}

/*
 		
		int size = arr.length;
		int number = 0;
		for(int i = 0 ; i < size  ;i++) {
			
			number = (int) (number + (arr[i] * (Math.pow(10 , (size-1-i)))));
			
		}
		int new_Number = number + 1;
		arr = numberToArray(new_Number);
		System.out.println(Arrays.toString(arr));

		}
	
	 public static int[] numberToArray(int number) {
	        String str = String.valueOf(number);
	        int[] digitArray = new int[str.length()];

	        for (int i = 0; i < str.length(); i++) {
	            digitArray[i] = Character.getNumericValue(str.charAt(i));
	        }

	        return digitArray;
	    }
*/
