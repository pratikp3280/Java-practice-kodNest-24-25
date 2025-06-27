import java.util.Scanner;
public class Graede {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Grade : ");
		char grade = scan.next().charAt(0);
		System.out.println("your Grade is: "+grade);
}
}