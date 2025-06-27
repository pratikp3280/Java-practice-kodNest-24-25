import java.util.Scanner;

public class i_Calculate {
	
	public static void main(String[] args) {
		
		i_Calculate calculator = new i_Calculate();
		
		//Calling Type-1 
		calculator.add();
		
		//Calling Type-2
		
		System.out.println("enter the valvue of x : ");
		int x = scan.nextInt();
		
		System.out.println("enter the valvue of y : ");
		int y = scan.nextInt();
		
		calculator.sub(x ,y);
		
		
		//Calling Type-3
		int multiplicationresult= calculator.mul();
		System.out.println("Multiplication Result: "+multiplicationresult);
		
		//Calling Type-4
		
		System.out.println("enter the valvue of m : ");
		int m = scan.nextInt();
		
		System.out.println("enter the valvue of n (Note n must be non Zero): ");
		int n = scan.nextInt();
		
		double division =calculator.div(m , n);
		System.out.println("divisuion Result: "+division);
		
	}
	         static Scanner scan=new Scanner(System.in);
	        //Type-1 no parameters no Returntype-(Addition)
			public void add() {
//				int a=10;
//				int b=5;
//				
				
				System.out.println("enter the valvue of a : ");
				int a =scan.nextInt();
				
				System.out.println("enter the valvue of b : ");
				int b =scan.nextInt();
				
				int sum = a+b;
				
				
				System.out.println("Addition Result: "+sum);
				
			}
			//Type-2 parameters no Returntype-(Substraction)
			public void sub(int a, int b) {
				int Substraction = a-b;
				System.out.println("Substraction Result: "+Substraction);
			}
			//Type-3 no parameters Returntype-(Multiplication)
			public int mul() {
				System.out.println("enter the valvue of num1 : ");
				int num1=scan.nextInt();
				
				System.out.println("enter the valvue of num2: ");
				int num2=scan.nextInt();
				return num1*num2;
			}
			//Type-4  parameters  Returntype-(Division)
			public double div(int a , int b) {
				  double  division=a/b;
				return division;
			}
}

