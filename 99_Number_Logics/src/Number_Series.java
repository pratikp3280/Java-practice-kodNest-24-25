import java.util.Scanner;
public class Number_Series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number(For Finding nth Term) : ");
		int n = scan.nextInt();
		scan.close();
		int res = printSeries(n);
		System.out.println("The "+n+"th term of the series is "+res+".");
	}
	
	public static int printSeries(int n) {
		int seriesTerm = 0;
		int Count = 1;
		
		for(int i=1 ; i<=n ; i++) {
			seriesTerm = seriesTerm + Count;
			Count++;
		}
		return seriesTerm;
	}
	

}
