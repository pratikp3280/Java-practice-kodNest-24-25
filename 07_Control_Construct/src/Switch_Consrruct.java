import java.util.Scanner;
public class Switch_Consrruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		
		switch(day) {
		case 1: System.out.println("Monday");
		break;
		
		case 2: System.out.println("Tuesday");
		break;
		
		case 3: System.out.println("Wednesday");
		break;
		
		case 4: System.out.println("Thursday");
		break;
		
		case 5: System.out.println("Friayd");
		break;
		
		case 6: System.out.println("Saturday");
		break;
		
		case 7: System.out.println("Sunday");
		break;
		
		default:  System.out.println("Inavalid Number");
		}

	}

}
