package String_Programs;

import java.util.Scanner;

public class String_Unique_Finder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		
		
		
		String newstr = removeDuplicates( str);
		System.out.println("Original String: "+str);
		System.out.println("New String(by removing Duplicates): " + newstr);
		String_Unique_Finder.Frequency(str, newstr);
		
		
	}
	
	
	public static String removeDuplicates(String str) {
		String newstr = "";
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			char ch = str.charAt(i);
			
			if(!(newstr.contains(String.valueOf(ch)))) {
				
				newstr = newstr + ch;
				
			}
		}
		return newstr;
	}
	
	
	public static void Frequency(String str, String newstr) {
		
		char [] arr = str.toCharArray();
		char [] newarr = newstr.toCharArray();
		
		
		for(int i = 0 ; i < newarr.length ; i++) {
			int count = 0;
			for(int j = 0 ; j < arr.length ; j++) {
				
				if(newarr[i] == arr[i]) {
					count++;
				}
			}
			System.out.println("Frequency of " +newarr[i] + " is: " +  count);
		}
		
		
	}

}
