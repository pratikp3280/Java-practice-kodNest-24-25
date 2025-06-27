package Hibernate_Sample;

public class DataBase_Object {
	
	public static void main(String[] args) {
		
	}
}

class Student {
	
	int Kodid;
	String name;
	String address;
	int year;
	
	// Paramaeterized Constructor
	public Student(int Kodid, String name, String address,  int year ){
		this.Kodid = Kodid;
		this.name = name;
		this.address = address;
		
	}
	
}
