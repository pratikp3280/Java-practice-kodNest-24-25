import java.util.Scanner;
public class UserData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age  : ");
		byte age =scan.nextByte();
		
		System.out.println("Enter your Yop  : ");
		short yop =scan.nextShort();
		
		System.out.println("Enter your salary  : ");
		int sal =scan.nextInt();
		
		System.out.println("Enter your Phno : ");
		long PhNo =scan.nextLong();
		
		System.out.println("Enter your Grade  : ");
	    String grade =scan.next();
		
		System.out.println("age: "+age);
		System.out.println("Yop  : "+yop);
		System.out.println("salary: "+sal);
		System.out.println("age: "+PhNo);
		System.out.println("Grade: "+grade);
		
		

	}

}
