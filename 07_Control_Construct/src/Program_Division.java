import java.util.Scanner;
class Program_Division {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Enter the Student Name: ");
		String Div = displayNames(name);
		System.out.println(Div);
		
		
		
	}
	 static String displayNames ( String name) {
		 
		switch(name) {
		case "Ramesh" : System.out.println("Class A");
		break;
		
		case "Sumit" :  System.out.println("Class B");
		break;
		
		case "Dheeraj" :  System.out.println("Class C");
		break;
		
		case "Mohit" :  System.out.println("Class D");
		break;
		
		default : return "No Student found";
				
		}
		return name;
		
		
	}

}
