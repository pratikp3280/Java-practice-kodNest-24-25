package Loop_Tasks;
import java.util.Scanner;
public class Print_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The value How much Numbers I Want to Print:  ");
		int n = scan.nextInt();
		scan.close();
		
		int i = 0;      //Initializing the Loop Variable
		
		while(i<=n) {
			System.out.println(i);           //printing the Numbers 
			i++;                             //incrementing the Number after print
			}
		//once i exceeds the n Value Loop terminates 

	}

}
