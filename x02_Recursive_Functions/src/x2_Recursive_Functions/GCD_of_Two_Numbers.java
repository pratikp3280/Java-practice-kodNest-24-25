package x2_Recursive_Functions;

import java.util.Scanner;

public class GCD_of_Two_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
;
		int result = Find_gcd(m,n);
		System.out.println(result);
	}
	
	public static int Find_gcd(int m, int n) {
		if(n==0) {
			return 0;
			
		}
		else {
		return Find_gcd(n , m % n );
		}
		
	}

}
