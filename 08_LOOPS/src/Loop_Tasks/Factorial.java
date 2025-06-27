package Loop_Tasks;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number  ");
		int n = scan.nextInt();
		int fact = 1;
		scan.close();
		
		while(n!=0) {
			fact = fact*n;
			n--;
		}
		
		System.out.println("Factorial of "+ n + " is "+ fact);
	}

}
