package Area_Finder;

import java.util.Scanner;

public class Circle extends Shape{
	
	
	double radius;
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius ");
		double radius = scan.nextDouble();
		
		scan.close();
	}
	
	@Override
	void calculateArea() {
		 area = Math.PI * radius * radius;
	}
	

}
