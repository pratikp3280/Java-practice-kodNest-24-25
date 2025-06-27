import java.util.Scanner;

public class Pattern_Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value of N");
		int N = scan.nextInt();
		
		int count= N*N;
		scan.close();
		
		for(int i = 1 ; i<=N ; i++) 
		{
			for(int j=1 ; j<=N ; j++) {
				System.out.print(count-- +" ");
//				count--;
				
			}
			System.out.println();
		}

	}

}
