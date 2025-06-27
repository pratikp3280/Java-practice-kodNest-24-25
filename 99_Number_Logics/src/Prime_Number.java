import java.util.Scanner;
public class Prime_Number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n = scan.nextInt();	
		scan.close();
		System.out.println(" The first " + n + " prime Numbers are : ");
		int count = 0;
		int num = 2;
		
		while(count < n) {
			if(isPrime(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}

	}
	
	public static boolean isPrime(int number) {
		if(number <= 1) 
		{
			return false;
		}
		for (int i = 2 ; i <= Math.sqrt(number) ; i++) 
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}

