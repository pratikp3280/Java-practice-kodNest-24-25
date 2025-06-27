
public class matrix_1x10 {

	public static void main(String[] args) {
		
		// A B C D E F H I L O P Q T U X Z
		int n = 11;
		for(int i=0 ; i<= n-1; i++) {
			for(int j=0 ; j<=n-1 ; j++) {
				
				if (i==0 || j==0  || i==10 || j==10 || i+j==5 || j-i==5 || i-j==5 || i+j == (n-1)+(n/2) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
