import java.util.Scanner;

public class Pattern_Floid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value of N");
		int N = scan.nextInt();
		
		int count= 1;
		scan.close();
		
		for(int i = 1 ; i<=N ; i++) 
		{
			for(int j=1 ; j<=i ; j++) {
				System.out.print(count +" ");
				count++;
				  
			}
			System.out.println();
		}

	}

}
