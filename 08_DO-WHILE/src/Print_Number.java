import java.util.Scanner;
public class Print_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int N = scan.nextInt();
		int i = 3;
		
		do {
			if(i%10==3) {
			System.out.println(i);
			
			}
			i++;
			
		} while(i<=N);
	}

}
