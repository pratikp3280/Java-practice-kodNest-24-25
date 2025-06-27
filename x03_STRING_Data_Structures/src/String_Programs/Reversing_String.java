package String_Programs;

import java.util.Scanner;

public class Reversing_String {

	public static void main(String[] args) {

		String str = "Kodnest";
		
		// converting String into Char type Array using: toCharArray()
		
		char[] arr = str.toCharArray();
		
		char[] revarr = new char[arr.length];
		
		int j = revarr.length-1;
		
		for(int i =0 ; i <= arr.length-1; i++) {
			revarr[i] = arr[j];
			j--;
		}
		
		String revstr = new String(revarr);
		System.out.println("The reversed String is: " + revstr);
		
		

	}

}
