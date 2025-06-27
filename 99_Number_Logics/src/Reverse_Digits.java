import java.util.Scanner;
public class Reverse_Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        scan.close();
  
        
        int revNum = 0 ;

        if(num == 0) {
        	System.out.println("You entered Zero");
        }
        else {
        	while(num > 0) {
        		
/**int digit = num % 10; */         int rem = num % 10 ;
/** num = num/10 ;	*/			    revNum = ( revNum * 10 ) + rem;
/**  System.out.println(digit);*/   num = num /10 ;
 
        	}
        	System.out.println(revNum);
        }
        

	}

}
