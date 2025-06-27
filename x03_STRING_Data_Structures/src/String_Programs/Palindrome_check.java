package String_Programs;

import java.util.Scanner;

public class Palindrome_check {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		
		// converting String into Char type Array using: toCharArray()
		char[] arr = str.toCharArray();
		
		//new Array for storing reversed String
		char[] revarr = new char[arr.length];
		
		
		int j = revarr.length-1;
		for(int i =0 ; i <= arr.length-1; i++) {
			revarr[i] = arr[j];
			j--;
		}
		
		String revstr = new String(revarr);
		
		if(str.equals(revstr)) {
			System.out.println("The Given word is a Palindrome");
		}
		else {
			System.out.println("NOT a Palindrome");
		}
	}

}
