import java.util.Scanner;
public class Pattern_Alphabets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value of n");
		int n = scan.nextInt();
		char ch = 'A';
		
		
		for(int i=1 ; i<=n ; i++) 
		{
			for(int j=1 ; j<=n ; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println("");		
			}
		

	}

}
