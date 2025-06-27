package Anonymous_class_2;

abstract class Calculator {
	int num1;
	int num2;
	
	abstract void add();
	
	abstract void subtract();
	
	void multiply() {
		System.out.println(num1*num2);
	}
}
