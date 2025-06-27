package Loop_Tasks;
import java.util.Scanner;
public class Add_Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number:  ");
		int num = scan.nextInt();
		int sum = 0;
//		int temp = num;
		scan.close();
		
		while(num !=0) {
			int digit = num % 10;   // Divides the Given Number by 10  Gives a Remainder As last digit of a Number
			num = num/10;			// it gives the Quotient after dividing the Given number
			sum = sum+digit;
		}
		System.out.println("Sum Of All the Digits is : "+sum);
	}

}
