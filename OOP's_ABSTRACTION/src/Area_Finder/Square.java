package Area_Finder;

import java.util.Scanner;

public class Square extends  Shape{

	double side;
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side of Square ");
		int side = scan.nextInt();
		
		scan.close();
	}
	
	@Override
	void calculateArea() {
		 area =  side * side ;
	}
	
}
