package Intro;

public class Try_Catch_nested {

	public static void main(String[] args) {
		try {
			int arr[] = new int[-5];
		}
		catch(Exception e1) {
			System.out.println("First Catch Block");			
			try {
				int arr2[] = new int[-10];
			}
			finally {
				System.out.println("Finally of 2nd try");			
				}
		}
		finally {
			System.out.println("Finally of 1st try");			
		}

	}

}
