package Laptop_Person;

public class Laptop {
	public String processor = "i5";
	public String OS = "Windows";
	
	public void switchOn() {
	System.out.println("Laptop is ON");	
	}
	
	public void shutDown() {
		System.out.println("Laptop is oFF");
	}
	
	public void laptopInfo() {
		System.out.println("Processor: " + processor);
		System.out.println("OS: " + OS);
	}
	

}
