import java.util.Scanner;
public class Fact_Calculate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number For which You want a factorial : ");
		int num = scan.nextInt();
		int temp = num;
				
		int fact = 1;
		
		do {
			fact *= temp;
			temp--;
			
		} 
		while(temp > 0);
		
		System.out.println("Factorial of " + num + " is : " + fact);

	}

}
