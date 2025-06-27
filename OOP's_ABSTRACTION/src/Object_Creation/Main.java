package Object_Creation;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Alice",   35000.00,"alice@gmail.com" , 9845983645L, "Bengaluru ,Karnataka",  "java Developer", "Male");
		System.out.println("--------------------------------");
		
		Employee e2 = new Employee(102, "Bob",   35000.00, "bob@gmail.com",7855983645L,  "Pune , Maharashtra",  "java Developer", "Male");
		System.out.println("--------------------------------");
		
		Employee e3 = new Employee(102, "Devid ",   35000.00,"Devid@gmail.com", 8217483280L,  "Chennai, Tamilanadu",  "Data Analyst", "Male");
	

	}

}
