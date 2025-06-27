import java.util.Scanner;
public class ODD_sum_of_Squares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n Value:");
        int n = scanner.nextInt();
        scanner.close();
        
        int  sum = 0;
        
        for(int i=0 ; i<=n ; i++) {
        	if(i%2!=0) {
        	System.out.println(i+" ");
        	sum = sum + (i*i);
        	}
        }
        System.out.println();
        System.out.println("The sum of First n Odd numbers Squares is: "+ sum);

	}

}
