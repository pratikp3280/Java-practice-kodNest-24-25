import java.util.Scanner;
public class Count_Even_Odd_digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        scan.close();
        
        int[] counts = countDigits(num);;
        int evencount = counts[0];
        int oddcount  = counts[1];
        
        System.out.println("The Count of Even digits  in Given Number is:  "+ evencount);
    	System.out.println("The Count of Odd digits  in Given Number is:  "+ oddcount);
        
	}

	public static int[] countDigits(int num) {
		int evencount = 0;
        int oddcount = 0;
		if(num == 0)
		{
        	System.out.println("You entered Zero");
        }
        else {
        	while(num > 0) {
        		int digit = num % 10;
        		num = num/10 ;
        		
		        		if(digit%2==0) {
		        			evencount = evencount + 1;
		        			
		        		}
		        		else {
		        			oddcount = oddcount + 1;
		  			
		        		}
        		
        	  }

	}
		// Return both counts as an array
        return new int[] {evencount, oddcount};

}}
