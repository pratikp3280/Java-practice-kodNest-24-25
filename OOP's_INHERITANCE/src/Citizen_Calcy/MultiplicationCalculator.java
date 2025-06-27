package Citizen_Calcy;

import java.util.Scanner;

public class MultiplicationCalculator extends Calculator{
//	int a , b;
	@Override
	void takeUserInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Taking User Input for Multiplication: ");
		 a = scan.nextInt();
		 b = scan.nextInt();
		}
	
	@Override
	void performCalculation() {
		System.out.println("Perfoming Calculation");
		result = a * b;
		
		
	}
	
//	@Override
//	void displayResult(){
//		System.out.println("Result: " + result);
//	}
}
