import java.util.Scanner;
public class Factorial_Method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		System.out.println("Enter the Number For which You want a factorial : ");
		
		 //Print_factorial(num);
		System.out.println("Factorial of " + num + " is : " +  Print_factorial(num));
			
		}
	
	 public static int  Print_factorial(int num) {
		 int fact = 1;
		 int temp = num;
		do {
			fact *= temp;
			temp--;
		} 
		while(temp > 0);
		return fact;
	}
			 
}
