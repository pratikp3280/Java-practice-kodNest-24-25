
public class Calculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		//Calling Type-1 
		calculator.add();
		
		//Calling Type-2
		calculator.sub(15,5);
		
		//Calling Type-3
		int multiplicationresult= calculator.mul();
		System.out.println("Multiplication Result: "+multiplicationresult);
		
		//Calling Type-4
		double division =calculator.div(100 , 5);
		System.out.println("divisuion Result: "+division);
		
	}
	
	        //Type-1 no parameters no Returntype-(Addition)
			public void add() {
				int a=10;
				int b=5;
				int sum=a+b;
				System.out.println("Addition Result: "+sum);
			}
			//Type-2 parameters no Returntype-(Substraction)
			public void sub(int a, int b) {
				int Substraction = a-b;
				System.out.println("Substraction Result: "+Substraction);
			}
			//Type-3 no parameters Returntype-(Multiplication)
			public int mul() {
				int num1=5;
				int num2=4;
				return num1*num2;
			}
			//Type-4  parameters  Returntype-(Division)
			public double div(int a , int b) {
				  double  division=a/b;
				return division;
			}
}
