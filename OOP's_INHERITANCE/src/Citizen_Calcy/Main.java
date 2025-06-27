package Citizen_Calcy;

public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		
		cal = new AdditionCalculator();
		cal.takeUserInput();
		cal.performCalculation();
		cal.displayResult();
		
		
		cal = new SubractionCalculator();
		cal.takeUserInput();
		cal.performCalculation();
		cal.displayResult();
		
		
		cal = new MultiplicationCalculator();
		cal.takeUserInput();
		cal.performCalculation();
		cal.displayResult();
		
		cal = new DivisionCalculator();
		cal.takeUserInput();
		cal.performCalculation();
		cal.displayResult();
	}
}
