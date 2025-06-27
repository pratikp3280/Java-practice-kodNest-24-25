package Area_Finder;

import java.util.Scanner;

public  class Rectangle extends  Shape{
	
	double length , breadth ;
	@Override
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle: ");
		double length = scan.nextDouble();
		System.out.println("Enter the breadth of Rectangle: ");
		double breadth = scan.nextDouble();
		scan.close();
	}
	
	@Override
	void calculateArea() {
		 area = length * breadth;
	}
	
	
	
	
}
