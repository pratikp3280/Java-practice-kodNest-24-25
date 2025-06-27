package Encapsulation;

public class Student {
	
	String name;
	int age;
	double marks;
	
	// Public setter method
	public void setData(String name,int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
//	public getter method
	public int getData() {
		return age;
		
	}
	
}
