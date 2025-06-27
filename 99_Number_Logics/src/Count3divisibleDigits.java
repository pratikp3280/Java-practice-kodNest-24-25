import java.util.Scanner;
public class Count3divisibleDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        scan.close();
        
        int digits = count3DivisibleDigits(num);
        System.out.println(digits);
        
        int digits1 = count2DivisibleDigits(num);
        System.out.println(digits1);
        
	}
	
	public static int count3DivisibleDigits(int num) {
		int digitCount = 0;
		while(num > 0) 
		{
			int digit = num % 10;
			if(digit % 3 == 0) 
			{
				digitCount++;
			}
			num = num/10;
		}
	 return digitCount;
	}
	
	public static int count2DivisibleDigits(int num) {
		int digitCount = 0;
		while(num > 0) 
		{
			int digit = num % 10;
			if(digit % 2 == 0) 
			{
				digitCount++;
			}
			num = num/10;
		}
	 return digitCount;
	}

}
