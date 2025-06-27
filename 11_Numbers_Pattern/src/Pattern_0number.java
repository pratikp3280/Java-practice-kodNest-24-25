import java.util.Scanner;

public class Pattern_0number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value of N");
		int N = scan.nextInt();
		
		int oddCount= 1;
		int evenCount=2;
		scan.close();
		
		for(int i = 1 ; i<=N ; i++) 
		{
			for(int j=1 ; j<=N ; j++) {
				
				if(i%2!=0) 
				{
				     if(oddCount<=9) {
				           System.out.print("0"+oddCount +" ");
				            oddCount+=2;
				     }
				     else {
					       System.out.print(oddCount +" ");
					       oddCount+=2;
				          }
				}
				else {
					if(evenCount<=9) {
				           System.out.print("0"+evenCount +" ");
				            evenCount+=2;
				     }
				     else {
					       System.out.print(evenCount +" ");
					       evenCount+=2;
				          }
				     }
				 
				if(i%2==0) 
				{
				     if(oddCount<=9) {
				           System.out.print("0"+oddCount +" ");
				            oddCount+=2;
				     }
				     else {
					       System.out.print(oddCount +" ");
					       oddCount+=2;
				          }
				}
				else {
					if(evenCount<=9) {
				           System.out.print("0"+evenCount +" ");
				            evenCount+=2;
				     }
				     else {
					       System.out.print(evenCount +" ");
					       evenCount+=2;
				          }
				     }
				
			}
			System.out.println();
		}

	}

}
