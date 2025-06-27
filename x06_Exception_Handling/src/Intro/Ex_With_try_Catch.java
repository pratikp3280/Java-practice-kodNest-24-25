package Intro;

import java.util.Scanner;

public class Ex_With_try_Catch {

	public static void main(String[] args) {
		
		System.out.println("Division Program Started...");
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the First Number: ");
			int num1 = scan.nextInt();
			
			System.out.println("Enter the Second Number: ");
			int num2 = scan.nextInt();
			
			int result = num1 / num2;
			
			System.out.println("The Division of two numbers is : " + result );
		
			}
		catch (Exception ex) {
			System.out.println("Exception was Handled Safely..");
			ex.printStackTrace();
			}
		
		System.out.println("Division Program Ended.");
		System.out.println("Some Other Programs.... ");
		
		
		
		
		//final : its a keyword
		//finally{}  its a part of try-catch block
 		//finalize() its a method 
 	}

}
