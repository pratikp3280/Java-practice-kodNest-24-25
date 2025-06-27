package String_Programs;

import java.util.Scanner;

public class Anagram_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String str1 = scan.nextLine();
		
		System.out.println("Enter the Second String: ");
		String str2 = scan.nextLine();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		if(arr1.length != arr2.length) {
			System.out.println("The Given Two Strings are not anagrams!!");
			return;
		}
		
		
		int[] countArr = new int[arr1.length];
		
		for(int i = 0; i < arr1.length ; i++){
			int count = 0;
			for(int j = 0; j < arr2.length ; j++ ) {
				
				if(arr1[i] != arr2[j]) {
					continue;
				}
				else {
					count = count + 1;
					countArr[i] = count;
				}
			}
		}
		
		for(int x : countArr) {
			if(x == 0) {
				System.out.println("The Given Two Strings are not anagrams!!");
				return;
			}
		}
		
		System.out.println("Yes they are anagrams");
		
		
		
	}

}
