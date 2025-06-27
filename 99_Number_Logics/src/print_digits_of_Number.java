import java.util.Scanner;

public class print_digits_of_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        scan.close();
  
        
        if(num == 0) {
        	System.out.println("You entered Zero");
        }
        else {
        	
        	while(num > 0) {
        		
				 int digit = num % 10;      
				 num = num/10 ;		   
				 System.out.println(digit);
 
        	         }
        	
        }
	}

}

//ALGORITHM
//step-1 : taking user input as num variable
//step-2 : use  if-else construct with condition ( while num > 0)
//step-3 : perform modulus operation to get remainder (num % 10) and store this in digit variable
// step-4 : every time divide the num by 10 to get new number(quotient) (until loop gets end)
//step-5  :  print  the digit every time loop gets executed
