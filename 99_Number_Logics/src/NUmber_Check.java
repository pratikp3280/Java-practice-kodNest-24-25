import java.util.Scanner;
public class NUmber_Check {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a First Number: ");
		int num = scan.nextInt();
		
		
		scan.close();
		
		if(num>0) {
			System.out.println("Positive Number");
		}
		else if(num<0) {
			System.out.println("Negetive Number");
		}
		else {
			System.out.println("You Entered a zero");
		}
		
		

	}

}
