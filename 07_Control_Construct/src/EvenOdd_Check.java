import java.util.Scanner;
public class EvenOdd_Check {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number:  ");
		int num = scan.nextInt();
		
		scan.close();
		
		if(num > 0){
			if(num%2==0) {
				System.out.println("Even-Positive");
			}else {
				System.out.println("Odd-Positive");
			}
		}else if(num<0) {
			if(num%2==0) {
				System.out.println("Even-Negetive");
			}else {
				System.out.println("Odd-Negetive");
			}
		}else if(num==0) {
				System.out.println("Zero is Not a Even/Odd value");
		}
		
		else {
			System.out.println("Inavalid Number");
		}
	}

}
