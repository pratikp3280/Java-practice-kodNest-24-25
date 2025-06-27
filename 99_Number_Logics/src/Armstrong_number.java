import java.util.Scanner;
public class Armstrong_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        scan.close();
        
        int power = countDigits(num);
        int sum = checkArmStrongNumber(num , power);
      //  comparing the num with sum
        if (num == sum) {
        	System.out.println(num + " is  an armstrong Number.");
        }else {
        	System.out.println(num + " is not an  armstrong Number.");
        }
   

	}
	
	// counting the number of digits 
	public static int countDigits(int num) {
		int digitCount = 0;
		while (num > 0 ) {
			num = num / 10;
			digitCount++;
		}
		System.out.println("digitCount/power: "+ digitCount);
		return digitCount;
	}
	
	// check num is armstrong or not 
	public static int checkArmStrongNumber(int num , int power) {
		int sum = 0;
		while (num >0) {
			//finding the digit
			int digit = num % 10;
			int powerValue =  findPower(digit , power);
			
			sum = sum + powerValue;
			// removing last digit of the sum
			num  = num / 10;
		}
		System.out.println("sum of all digits^power: "+ sum);
		return sum ;
	}
	
	// finding and returning the value after power
	public static int findPower(int num , int power) {
		int numPower = 1;
		
		for(int i=1 ; i<= power ; i++) {
			numPower = numPower * num;
		}
		System.out.println("numPower: "+ numPower);
		return numPower;
	}
	
	
	


}
