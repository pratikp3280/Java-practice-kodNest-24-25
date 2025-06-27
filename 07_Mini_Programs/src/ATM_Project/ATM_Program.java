package ATM_Project;
import java.util.Scanner;
public class ATM_Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your PIN:  ");
		int pin = scan.nextInt();
		//initial pin is 1234
		int ammout = 10000;
		
		
		
		
		
		if(pin == 1234) {
			System.out.println("1.WITHDRAW");
			System.out.println("2.DEPOSIT");
			
			System.out.println("Choose an Option(1/2): ");
			int opt = scan.nextInt();
			if(opt==1) {
				System.out.println("Enter Your Withdraw Money :  "); 
				int ammount = scan.nextInt();
				System.out.println("Withdraw Succesful: RS"+ammount);
			}
			else if(opt==2) {
				System.out.println("Enter Your Deposit Money :  "); 
				int ammount = scan.nextInt();
				System.out.println("Deposit Succesfully: RS"+ammount);
			}
			
			 
			
			
			
			
		}
		else {
			System.out.println("Incorrect PIN.");
		}
		

	}

}
