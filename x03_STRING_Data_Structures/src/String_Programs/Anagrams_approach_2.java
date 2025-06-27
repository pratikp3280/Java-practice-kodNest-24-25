package String_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams_approach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String str1 = scan.nextLine();
		
		System.out.println("Enter the Second String: ");
		String str2 = scan.nextLine();
		
		char[] arr1 = str1.toCharArray();
		
		char[] arr2 = str2.toCharArray();
		
		 Arrays.sort(arr1);
		 String newstr1 = new String(arr1);
		
		 Arrays.sort(arr2);
		 String newstr2 = new String(arr2);
		 
		 
			if(arr1.length != arr2.length) {
				System.out.println("The Given Two Strings are not anagrams.");
			}
			else {
				if(newstr1.equals(newstr2)) {
					System.out.println("Yes they are anagrams");
				}
				else {
					System.out.println("The Given Two Strings are not anagrams.");
				}
			}
	
	}

}
