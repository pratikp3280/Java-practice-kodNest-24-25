package String_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Vowel_Finder {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		str = str.toLowerCase();
		
		 String vowels = reverseVowels(str);
		 String  consonants = findConsonents(str);
		 System.out.println("Extracted Vowels (reversed): " + vowels);
	     System.out.println("Extracted Consonants (same order): " + consonants);
		
	}
	
	public static String reverseVowels(String str) {
		String newStr = "";
		for( int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u') {
				newStr = ch + newStr;
			}
		}
		return newStr;
	}
	
	public static  String findConsonents(String str) {
		String newStr = "";
		for( int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u')) {
				newStr = newStr  + ch;
			}
		}
		return newStr;
	}

}
