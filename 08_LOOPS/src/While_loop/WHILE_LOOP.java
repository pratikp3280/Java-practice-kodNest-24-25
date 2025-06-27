package While_loop;
import java.util.Scanner;
public class WHILE_LOOP {

	public static void main(String[] args) {
//		printing even numbers from 1 to N
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Last Number Upto where You Want the Even Numbers: ");
		int N = scan.nextInt();
		
		int i =1;
		while(i<=N) {
			if(i%2==0) {
			System.out.println(i);
			
			}
			i++;
		}
		
	}

}
