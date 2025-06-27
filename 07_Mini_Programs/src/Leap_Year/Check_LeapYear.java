package Leap_Year;
import java.util.Scanner;
public class Check_LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year:  ");
		int year = scan.nextInt();
		scan.close();
		
		if(year%100==0 || year%4==0 || year%400==0) {
			System.out.println(year+" is a leap Year");
			
			
		}else if(year<0){
				System.out.println("Invalid year : Please enter a Positive Year");
			}else {
				System.out.println(year+" is Not a Leap Year");
			}
    
	}

}
