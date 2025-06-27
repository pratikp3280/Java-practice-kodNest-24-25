package Interface5;

public interface Program1 {
	
	void method1();
	void method2();
	void method3();
	void method4();
	
//	static void method5();     //static abstract NOT ALLOWED
    static void method5() {      //Static  Non-abstract Method ALLOWED
    	System.out.println("");
	}
    
//    default void Method6();    //default abstract Method NOT-ALLOWED
    default void Method6() {    //default Non-abstract Method ALLOWED
    	
    }
    
    
//    private void Method7();  //Private abstract Method NOT-ALLOWED
    private void Method7() {   //Private Non abstract Method ALLOWED
    	
    }
}
