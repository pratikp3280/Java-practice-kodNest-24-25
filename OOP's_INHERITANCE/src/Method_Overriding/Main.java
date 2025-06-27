package Method_Overriding;

public class Main {

	public static void main(String[] args) {
		Parent pr = new Parent();
		pr.displayMsg();
		pr.displayX();
		
		
		Child1 c1 = new Child1();
		c1.displayMsg();
		c1.displayX();
		System.out.println("----------------------");
		
		Child2 c2 = new Child2();
		c2.displayMsg();
		c2.displayX();
		System.out.println("----------------------");
		
		Child3 c3 = new Child3();
		c3.displayMsg();
		c3.displayX();
		System.out.println("----------------------");
		
	}

}
