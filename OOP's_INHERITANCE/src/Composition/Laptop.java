package Composition;

public class Laptop {
	String processor = "i5";
	String OS = "Windows";
	
	void switchOn() {
	System.out.println("Laptop is ON");	
	}
	
	void shutDown() {
		System.out.println("Laptop is oFF");
	}
	
	void laptopInfo() {
		System.out.println("Processor: " + processor);
		System.out.println("OS: " + OS);
	}
}
