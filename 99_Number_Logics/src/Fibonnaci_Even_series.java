import java.util.Scanner;

public class Fibonnaci_Even_series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number of Terms in fibonacci Series: ");
		int n = scan.nextInt();	//Getting the user input and Storing it in variable n
		scan.close();
		
		printFibonacciSeries(n);
		

	}
	static void printFibonacciSeries(int n)
	{
		int num1 = 0;
		int num2 = 1;
		
		for(int i =3 ; i<= n; i++)
		{
			int num3 = num1 + num2;          //Calculating the Next term
			
			num1  = num2;						
			num2 =  num3;
	
			if(num3 >=2) {
		     CheckEven(num3);  
			}
			
		}
	}
	
	static void CheckEven(int num)
	{
		if(num % 2 == 0) {
			System.out.println();
		}
	
	}
	

}
