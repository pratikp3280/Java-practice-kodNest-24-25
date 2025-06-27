import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number upto Where I Want to print Integers:");
		int N = scan.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=N);
	}

}
