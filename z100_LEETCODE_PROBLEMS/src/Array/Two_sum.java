package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Two_sum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 int[] arr = new int[n];
		 
		 for(int i=0;i<n;i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		int target = sc.nextInt();
		
		int[] narr = new int[2];
		
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(arr[i] + arr[j] == target) {
					  narr[0] = arr[i];
					  narr[1] = arr[j];
				 }
			 }
		 }
		 
		 //System.out.println(Arrays.toString(narr));
		 System.out.print("[");
		 for(int i=0;i<narr.length;i++) {
			 System.out.print(narr[i]);
			 
			 if(i < narr.length-1) {
				 System.out.print(",");
			 }
		 }
		 System.out.print("]");

	}
	
//	public static void takeIndex(int i,int j) {
//		System.out.println("["+i+","+j+"]");
//	}
	
	
	

}
