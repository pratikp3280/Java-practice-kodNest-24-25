import java.util.*;
public class EX_4User_input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of Rows: ");
		int row = scan.nextInt();
		
		System.out.println("Enter the Number of Columns: ");
		int col = scan.nextInt();
		
		System.out.println("Enter the Number of Symbol for Pattern: ");
		scan.nextLine();
		String Symbol = scan.nextLine();
		
		
		int i =1 ;
		do
		{
			int j=1;
			do
			{
				System.out.print(Symbol);
				j++;
			}
			while(j<=col);
			System.out.println();
			
			i++;
		}
		while(i<=row);
		scan.close();
	}
	

}
