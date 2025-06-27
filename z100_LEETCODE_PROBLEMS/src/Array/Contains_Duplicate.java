package Array;

public class Contains_Duplicate {

	public static void main(String[] args) {
		
		int[] nums = {2,3,4,1,9,5,2};
		
		int size = nums.length; //4
		
		
		boolean result = containsDuplicate(nums);
		System.out.println(result);
	}
	
	 public static boolean containsDuplicate(int[] nums) {
	        
		 boolean res = false;
		 
		 for(int i = 0; i < nums.length; i++) {
			 for(int j = i+1; j < nums.length; j++) {
				 if(nums[i] == nums[j]) {
					 return true;
					 
				 }
			 }
		 }
		return res;
		 
	    }

}
