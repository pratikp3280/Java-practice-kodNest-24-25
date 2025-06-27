package Object_Creation;

public class Employee {
	
	int id;
	String name;
	double salary;
	String emailId;
	long Phone;
	String address;
	String department;
	String gender;
	
	
	// Paramaeterized Constructor
	Employee(int a, String b,double c,String d, long e, String f , String g , String h  ) {
		 id = a;
		 name = b;
		 salary = c;
		 emailId = d;
		 Phone = e;
		 address = f;
		 department = g;
		 gender  = h;
		 
		 
	}
	
	
	void empDetails() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Email ID: " + emailId);
		System.out.println("Phone Number: " + Phone);
		System.out.println("Address; " + address);
		System.out.println("Department: " + department);
		System.out.println("Gender: " + gender);
		}
}
