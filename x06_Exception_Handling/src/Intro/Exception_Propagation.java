package Intro;

public class Exception_Propagation {

	public static void main(String[] args) {
		System.out.println("Main Started...");
		try {
			alpha();
		}
		catch(Exception e) {
			System.out.println("exception Recived By main");
		}
		System.out.println("Main Ended.");
	}
	
	private static void alpha() throws Exception {
		System.out.println("alpha Started...");
		try {
			beta();
		}
		catch(Exception e) {
			System.out.println("alpha Handled exception");
			throw e;
		}
		System.out.println("alpha Ended.");
	}
	
	protected static void beta() throws Exception {
		System.out.println("beta Started...");
			gamma();

		System.out.println("beta Ended.");
	}
	
	static void gamma() {
		System.out.println("gamma Started...");
		try {
			int[] arr = new int[-5];
		}
		catch(Exception ex) {
			System.out.println("catch of gamma($)");
			throw ex;
		}
		finally {
			System.out.println("gamma Ended.");
		}
 }
}