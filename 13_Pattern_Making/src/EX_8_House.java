
public class EX_8_House {

	public static void main(String[] args) {
		for(int i = 1 ; i<=5 ; i++) 
		{
			for(int j = 1 ; j<=6-i ; j++) {
				System.out.print("+");
			}
			for(int j = 1 ; j<=(2*i)-1 ; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		for(int i = 1 ; i<=4 ; i++) 
		{
			System.out.print("+");
			for(int j=1 ; j<=3; j++) {
				System.out.print("*");
			}
			for(int j=1 ; j<=3; j++) {
				System.out.print("+");
			}
			for(int j=1 ; j<=3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
