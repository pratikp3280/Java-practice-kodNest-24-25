import java.util.Scanner;
public class Area_Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Shape: ");
		String shape = scan.next();
		
		switch(shape) {
		case "Square":
			System.out.println("Enter the Side-length of Square: ");
			double side = scan.nextDouble();	
			System.out.println("The area of Square is: ");
			AreaFind.SquareArea(side);
			break;
			
		case "Rectangle":
			System.out.println("Enter the length and breadth of Rectangle: ");
			double length = scan.nextDouble();
			double breadth = scan.nextDouble();
			System.out.println("The area of rectangle is: ");
			AreaFind.RectangleArea(length , breadth);
			break;
			
		case "Circle":
			System.out.println("Enter the Radius of Circle: ");
			double radius = scan.nextDouble();
			System.out.println("The area of circle is: ");
			AreaFind.CircleArea(radius);
			break;
		}
		scan.close();

	}

}
