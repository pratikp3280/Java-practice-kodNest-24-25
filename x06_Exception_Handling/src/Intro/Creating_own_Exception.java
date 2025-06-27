package Intro;

import java.util.Scanner;

public class Creating_own_Exception {

	public static void main(String[] args) throws LessPercentageException ,InvalidBracnchException  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the Percentage");
		int p = scan.nextInt();
		
		if(p > 60) {
			System.out.println("You are  eligible");
		}
		else {
			throw new LessPercentageException("Not Eligible!-- need above 60%");
		}
		
		scan.nextLine();
		System.out.println("Please Enter the Branch");
		String b = scan.nextLine();
		
		if( b.equals("CS")) {
			System.out.println("You are  eligible");
		}
		else {
			throw new InvalidBracnchException("Not Eligible! -- Only CS Allowed");
		}
		
	}

}

class LessPercentageException extends Exception {
	public LessPercentageException(String msg) {
		super(msg);
	}
}
class InvalidBracnchException extends Exception {
	public InvalidBracnchException(String msg) {
		super(msg);
	}
}

//class EligiblityException extends RuntimeExveption {
//	public EligiblityException(String msg) {
//		super(msg);
//	}
//}