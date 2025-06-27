import java.util.Scanner;
public class Numbers_check {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a First Number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter a Second Number: ");
		int num2 = scan.nextInt();
		scan.close();
		
		if(num1>0) {
			System.out.println(num1 + " is Positive Number");
		}
		else if(num2<0) {
			System.out.println(num1 +" Negetive Number");
		}
		else {
			System.out.println("You Entered a zero");
		}
		
		if(num2>0) {
			System.out.println(num2 +" is Positive Number");
		}
		else if(num2<0) {
			System.out.println(num2 +" is Negetive Number");
		}
		else {
			System.out.println("You Entered a zero");
		}
		
		

	}

}
