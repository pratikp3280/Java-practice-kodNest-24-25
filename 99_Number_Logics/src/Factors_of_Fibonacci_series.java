import java.util.Scanner;
public class Factors_of_Fibonacci_series {

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
		
		for(int i =3 ; i<= n; i++){
			
			int num3 = num1 + num2;          //Calculating the Next term
			
			num1  = num2;						
			num2 =  num3;
			if(num3 >= 2) {
				PrintFactors(num3);
			}
		}
		
	}
	
	static void PrintFactors(int num)
	{
		System.out.print("The factors of "+num+" are :");
		for(int i =1 ; i<= num; i++){
			if(num % i == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();                         //next line after printing factors of each term
	}

}
