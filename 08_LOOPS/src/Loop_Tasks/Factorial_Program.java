package Loop_Tasks;
import java.util.Scanner;
public class Factorial_Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number:  ");
		int num = scan.nextInt();
		int temp = num;
		scan.close();
		
	
		System.out.println("Factorial of "+ temp + " is "+ Find_factorial(num) );
		

	}
	
	 static int Find_factorial(int num)
	{  
		 int fact =1; 
		while(num!=0) {
		 fact = fact*num;
		 num--;
		}
		return fact;
	}

}
