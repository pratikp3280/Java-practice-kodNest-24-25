import java.util.Scanner;
public class Single_digit_sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n = scan.nextInt();	
		int k = n;
		int res = SumOfDigits( n);
		while(res >= 10) {
			res = SumOfDigits(res);
		}
		System.out.println("The single-digit sum of digits of " + k + " is: " + res);
		scan.close();
	}
	
	public static int SumOfDigits(int n) {
		int sum = 0;
		while(n > 0) {
			int last = n % 10;         //extracting last Digit 
			sum = sum + last;
			n = n / 10;             //removing last Digit 
		}
		return sum ;
	}

}
