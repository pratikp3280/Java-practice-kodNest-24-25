import java.util.Scanner;
public class Square_Fibonacci_series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n = scan.nextInt();
		scan.close();
		int num1 = 0;   //fibonacci first term
		int a = num1;
		int num2 = 1;		 //fibonacci second term
		int b = num2;
		System.out.println("Here is Your Square of Fibonacci Series: ");
		
		printFibonacciSeries(n);

    	
		scan.close();
	}
	
	static void printFibonacciSeries(int n)
	{
		int num1 = 0;
		int num2 = 1;
		System.out.print((num1*num1)+" "+(num2*num2)+" ");
		for(int i =3 ; i<= n; i++){
			
			int num3 = num1 + num2;          //Calculating the Next term
			System.out.print(findSquare(num3) + " ");
			num1  = num2;						
			num2 =  num3;
			
		}
		
	}
	
	static int findSquare(int num)
	{
		return num * num;
	}

}
