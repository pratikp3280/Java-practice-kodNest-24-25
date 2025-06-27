import java.util.Scanner;
public class Fibonacci_Prime_Series {

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
		     CheckPrime(num3);  
			}
			
		}
	}
	 	
	static void CheckPrime(int num)
	{
		
		int count = 0;
		for(int i =1 ; i<= num; i++)
		{
			
			if(num % i == 0) 
			{
				count++;
			}
			
		}
		
		if(count == 2)
		{
			
			System.out.println(num);
		}
	}
	
	

}
