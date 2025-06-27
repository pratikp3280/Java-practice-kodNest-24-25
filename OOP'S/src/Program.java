// Program Class Having static variables , static Methods , non-static variables , non-static Methods
 class Program {
	 static int a , b;
	 static {
		 System.out.println("Inside static Block:");
		 a = 10;
		 b = 20;
		 
	 }
	 
	 static void display1() {
		 System.out.println("Inside static Method:");
		 System.out.println(a);
		 System.out.println(b);
	 }
	 
	 int x , y ;
	 {
		 System.out.println("Inside non-static Block:");
		 a = 11;
		 b = 22;
		 x = 33;
		 y = 44;
		 
	 }
	 
	 void display2() {
		 System.out.println("Inside Non-static Method:");
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(x);
		 System.out.println(y);
		 
	 }
}
 
//// Main Method  for Creating new Objects and calling methods From class Program  
// class Main1 {
//
//		public static void main(String[] args) {
//			Program.display1();
//			
//			Program pr = new Program();
//			pr.display2();
//
//		}
//
//	}
