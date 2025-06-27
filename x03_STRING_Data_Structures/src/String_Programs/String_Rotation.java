package String_Programs;

import java.util.Scanner;

public class String_Rotation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		
		System.out.println("Enter the number of position it should Rotate: ");
		int pos = scan.nextInt();
		
		System.out.println("Enter the Direction: ");
		String direction = scan.nextLine();
		
		
		System.out.println("Original String is: " + str);
		if(direction.toLowerCase().equals("right")) 
		{
			String Right_rotated = str.substring(str.length() - pos) + str.substring(0, str.length() - pos);
			System.out.println("Right Rotated String is: " + Right_rotated);
		}
		else if(direction.toLowerCase().equals("right")) 
		{
		String Left_rotated =  str.substring(str.length() - pos, 0) + str.substring (str.length() - pos) ;
		System.out.println("Left Rotated String is:  " + Left_rotated);
		}
		else {
			System.out.println("Invalid direction");
		}
		
	}
}
