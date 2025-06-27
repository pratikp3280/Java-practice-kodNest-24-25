package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Target_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = {0,1,2,2,3,0,4,2};
		
		 System.out.println("Enter Target  to search: ");
		int val = sc.nextInt();
		
		int count = removeElement(nums , val);
       System.out.println(count);
       System.out.println(Arrays.toString(nums));

	}
	
	
	public static int removeElement(int[] nums, int val) {
		 	
		 //two pointer appraoch
		 int i = nums.length -1 ;      // last index of an array
		
		
				int j = 0;            // first index of an array
				
				while(i != j) {         
					
				 if(val == nums[i] ) {
				    i--;  
				 }
				 
				 if (val == nums[j]){              //swap (place to last)if value is present 
	                int temp = nums[j];
				   nums[j] = nums[i];
				   nums[i] = temp;
				   
				 }
				 else {
					 j++;
				 }
			
			  }
		 
		 
		
			 return i+1;           //returns the number of elements(after removing)
	    }
	}