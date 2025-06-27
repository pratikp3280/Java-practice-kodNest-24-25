import java.util.Scanner;
public class n_Even_Numbers {

	public static void main(String[] args) {
		        // Use Scanner to take user input
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the n Value:");
		        int n = scanner.nextInt();
		        scanner.close();
		        
		        System.out.println("The first " +n+" even numbers are:");
		        
		        // Print the first n even numbers
		        
		        for(int i=1 ; i<=n ; i++){
		            int evenNumber = i*2 ;
		            
		            System.out.println(evenNumber);
		        }
		    
		

	}

}
