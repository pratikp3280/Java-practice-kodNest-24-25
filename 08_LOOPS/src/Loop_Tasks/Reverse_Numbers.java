package Loop_Tasks;
import java.util.Scanner;
public class Reverse_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number:  ");
		int num = scan.nextInt();
//		int temp = num;
		scan.close();
		
		while(num !=0) {
			int digit = num%10;
			num = num/10;
			System.out.println(digit);
		}

	}

}
