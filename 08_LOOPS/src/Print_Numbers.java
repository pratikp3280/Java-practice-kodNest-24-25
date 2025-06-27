import java.util.Scanner;
public class Print_Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The value How much Numbers i Want to Print:  ");
		int n = scan.nextInt();
		
		scan.close();
		
		
		for(int i=0 ; i<=n ; i++) {
			System.out.println(i);
		}
	}
}
