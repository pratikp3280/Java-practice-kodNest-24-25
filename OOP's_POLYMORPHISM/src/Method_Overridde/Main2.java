package Method_Overridde;

// In This Case All Mechanisms are In use :- Inheritence ,Upcasting , Polymorphism , DownCasting ,
public class Main2 {
	public static void main(String[] args) {
		accessMethods(new Child1());
		System.out.println("------------------------------------");
		
		accessMethods(new Child2());
		System.out.println("------------------------------------");
		
		accessMethods(new Child3());
		System.out.println("------------------------------------");
		
		
	}
	
	public static void accessMethods (Parent ref) {
		ref.display1();
		ref.display2();
		
		if( ref instanceof Child1) {
			((Child1)(ref)).displayChild1();
		}
		else if (ref instanceof Child2) {
			((Child1)(ref)).displayChild1();
		}
		else {
			((Child1)(ref)).displayChild1();
		}
	}
}
