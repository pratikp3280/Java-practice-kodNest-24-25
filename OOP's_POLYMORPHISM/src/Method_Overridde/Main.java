package Method_Overridde;

public class Main {
	public static void main(String[] args) {
		
		Parent ref ;  // Craeting Parent Type Reference
	
		 Child1 ch1 = new Child1();
		 ref = ch1;   //Upcasting: ref is refering child1 object
		 ref.display1();
		 ref.display2();
		 ch1.displayChild1();
		 //DownCasting: to call Child Specific method using Parent object
		 ((Child1)(ref)).displayChild1();
		 System.out.println("------------------------------------");
		 
		 Child2 ch2 = new Child2();
		 ref = ch2;  //Upcasting: ref is refering child2 object
		 ref.display1();
		 ref.display2();
		 ch2.displayChild2();
		//DownCasting to call Child Specific method using Parent object
		 ((Child2)(ref)).displayChild2();
		 System.out.println("------------------------------------");
		 
		 Child3 ch3 = new Child3();
		 ref = ch3;  //Upcasting: ref is refering child3 object
		 ref.display1();
		 ref.display2();
		 ch3.displayChild3();
		//DownCasting to call Child Specific method using Parent object
		 ((Child3)(ref)).displayChild3();
		 
		
	}

}
