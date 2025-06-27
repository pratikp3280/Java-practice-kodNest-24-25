import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the float Value :")	;
		float a = scan.nextFloat();
		
		System.out.println("Enter the double Value :")	;
		double b = scan.nextDouble();
		
		double result= a+b;
		
		System.out.println("The Float value is  :"+a)	;
		System.out.println("The Double value is   :"+b)	;
		
		System.out.println("The Result after adding Two Decimal No is  :"+result)	;
	}

}
