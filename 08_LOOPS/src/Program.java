import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Positive Number(Upto where You Want a Sum) : ");
		int N = scan.nextInt();
		int sum = 0;        //variable sum to store the Toatal Sum
		
		for(int i = 1 ; i <=N ; i++) {
			// adding Each Number to the sum 
			sum = sum + i;               //OR sum += i
					
		}
		System.out.println("Sum of natural numbers upto "+N+ " is :\t"+sum);
	}
}