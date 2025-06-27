package Area_Finder;

public class Main {
	public static void main(String[] args) {
		shapeMethods(new Rectangle());
		
		shapeMethods(new  Square());
		
		shapeMethods(new  Circle());
		
		
	}
	
	static void shapeMethods(Shape sh) {
		sh.acceptInput();
		sh.calculateArea();
		sh.displayArea();
	}

}
