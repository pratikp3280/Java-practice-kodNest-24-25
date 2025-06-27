import java.util.Scanner;
public class Sum_of_Squares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n Value:");
        int n = scanner.nextInt();
        scanner.close();
        
        
        int  sum = 0;
        System.out.println("Numbers Upto n are: ");
        for(int i=1 ; i<=n ; i++) {
        	System.out.print(i+" ");
        	sum = sum + (i*i);
        	
        }
        System.out.println();
        System.out.println();
        System.out.println("There squares are : ");
        for(int j=1 ; j<=n ; j++) {
        	int square  =  j*j;
        	System.out.print(square + " " );
        }
        System.out.println();
        
   
        
        System.out.println();
        System.out.println("Sum of Squares upto "+ n + " is : " + sum);
        
	}

}
