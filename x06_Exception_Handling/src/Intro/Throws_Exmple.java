package Intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws_Exmple {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
	}
}

	class Bank {
		public  void bankService() {
			System.out.println("Bank Service Executing");
			try {
				Atm atm = new Atm();
				atm.atmService();
			}
			catch(InputMismatchException ime) {
				System.out.println("Bank Handled Exception");
			}
			System.out.println("Bank Service Terminating");
		}
	}
	
	class Atm {
		public void atmService() throws InputMismatchException{
			System.out.println("ATM Service Executing");
			
			try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter The Pin");
			int pin = sc.nextInt();
			System.out.println("Pin: " + pin);
			}
			catch(InputMismatchException ime) {
				System.out.println("ATM Service Handled The Exception");
				
				throw ime;
			}
			finally {
			System.out.println("ATM Service Terminating");
			}
		}
	}
