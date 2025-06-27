package Final_Keyword;

public class Child extends Parent {      //ERROR Because We Can't Inherit the SuperClass which using Final Keyword
	void display() {
		System.out.println("Inside Child Display:");
		System.out.println("------------------------------------");
	}
}
