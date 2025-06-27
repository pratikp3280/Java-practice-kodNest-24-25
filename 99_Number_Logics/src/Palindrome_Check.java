import java.util.Scanner;
public class Palindrome_Check {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();	
		int k = num;
		
		int rev  = 0 ;
		while (num > 0 ) {
			int last  = num % 10 ;
			rev = (rev * 10) + last;
			num  = num / 10 ;
		}
		System.out.println("Oroginal Number: "+k);
		System.out.println("Palindrome Number: "+ rev);
		
		if(k == rev) {
			System.out.println(k +"is a Palindrome Number");
		}
		else {
			System.out.println(k +"is not a Palindrome Number");
		}
		scan.close();
	}

}
