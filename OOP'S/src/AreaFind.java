import java.util.Scanner;

class AreaFind {
	static void SquareArea(double side) {
		double area = side * side ;
		System.out.println(area);
		
	}
	
    static void RectangleArea(double length , double bredth) {
    	double area = length * bredth ;
		System.out.println(area);
	}
    
    static void CircleArea(double radius) {
    	double pi = 3.142;
    	double area =  pi * (radius *radius) ;
		System.out.println(area);
	}
    

}


