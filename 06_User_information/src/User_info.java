import java.util.Scanner;
public class User_info {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your userId  : ");
		byte userID =scan.nextByte();
		
		System.out.println("Enter your age  : ");
		short age =scan.nextShort();
		
		System.out.println("Enter your Phno : ");
		long PhNo =scan.nextLong();
		
		System.out.println("Enter your National Id : ");
		long NationID =scan.nextLong();
		
		System.out.println("Enter your height in meters : ");
		float height =scan.nextFloat();
		
		System.out.println("Enter your weight in kg : ");
		double weight =scan.nextDouble();
		
		System.out.println("Enter your Gender : ");
		String gender =scan.next();
		
		System.out.println("Are you Married(Yes/No) : ");
		boolean marriage =scan.nextBoolean();// not reads Enter 
		
		
		scan.nextLine();//reads Enter
		
		System.out.println("Enter your fullname");
		String fullName = scan.nextLine(); // reads the Name 
		
		System.out.println("your userID  is : "+userID);
		System.out.println("your age  is : "+age);
		System.out.println("your Phno  is : "+PhNo);
		System.out.println("your National ID  is : "+NationID);
		System.out.println("your Height  is : "+height+" meters");
		System.out.println("your  Weight  is : "+weight+" Kgs");
		System.out.println("your  Gender  is : "+gender);
		System.out.println("are you Married  : "+marriage);
		System.out.println("your fullname  is : "+fullName);
		
		
		
		
		
		
	}

}
