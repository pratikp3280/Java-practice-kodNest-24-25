
public class EX_PatternInverted_Rhombus {

	public static void main(String[] args) {
		for(int i = 1 ; i<=5 ; i++) 
		{
			for(int j = 2 ; j<=i ; j++) {
				System.out.print(" ");
			}
//			for(int j = 1 ; j<=11-2*i; j++) {    // (11-2n) where n=1,2,3......gives 9,7,5,3,1
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		for(int i = 2 ; i<=5 ; i++) 
		{
			for(int j = 2 ; j<=6-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j<=2*i-1 ; j++) {    // (2n-1) where n=1,2,3.....  gives ODD values 1,3,5...
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}

}
