package String_Programs;

import java.util.Scanner;

public class toLowercase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String str = scan.nextLine();
		String newstr = str.toLowerCase();
		System.out.println("You Entered: " + str);
		System.out.println("New Lowercase String: " + newstr);
		

	}

}
