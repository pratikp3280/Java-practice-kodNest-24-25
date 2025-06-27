package Intro;

public class Stack_Overflow_error {

	public static void main(String[] args) {
		func();

	}
	
	public static void func() {
		System.out.println("func() is Excecuting");
		func();
		
	}

}
