import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = scan.nextInt();
		
		if(marks>=35 && marks<=100) {
			System.out.println("Pass");
		}
		else if(marks>100) {
			System.out.println("Invalid Marks");
			
		}
		else {
			System.out.println("Fail");
		}
		

	}

}
