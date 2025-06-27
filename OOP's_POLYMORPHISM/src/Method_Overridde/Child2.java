package Method_Overridde;

public class Child2 extends Parent{
	
	@Override
	void display2() {
		System.out.println("inside Child2 display2.");
	}
	
	void displayChild2() {
		System.out.println("inside Child2 display.");
	}
}
