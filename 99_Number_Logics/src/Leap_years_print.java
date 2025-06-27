import java.util.Scanner;
public class Leap_years_print {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Starting  year: ");
		int start = scan.nextInt();
		
		System.out.println("Enter a ending year: ");
		int end = scan.nextInt();
		scan.close();
		
		for(int i = start ; i<=end ; i++) {
			if(i%4==0 && i%100!=0  || i%400==0 ) {
				System.out.println(i );
			}
			else {
				continue;
//				System.out.println(i+ "is not a leap year");
			}
		}

	}

}
