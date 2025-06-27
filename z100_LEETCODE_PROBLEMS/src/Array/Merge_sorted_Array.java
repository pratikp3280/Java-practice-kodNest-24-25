package Array;

import java.util.Arrays;

public class Merge_sorted_Array {

	public static void main(String[] args) {
		
		
		int[] nums1 = {0};
		
		
		int[] nums2 = {5};
		int n = nums2.length;
		int m = nums1.length - n ;
		int newsize =  m + n;
		
		int j = 0;
		for(int i = m ; i < newsize ; i++ ) {
			nums1[i] = nums2[j];
			j++;
		}
		
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
		
		

	}

}
