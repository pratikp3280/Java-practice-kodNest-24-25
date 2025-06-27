package Set_Interface;

public class HashCode_Method {

	public static void main(String[] args) {
		
		Student st1 = new Student(1 , "deep");
		System.out.println(st1.hashCode());
		
		Student st2 = new Student(1 , "deep");
		System.out.println(st2.hashCode());
		
		Student st3 = new Student(1 , "deep");
		System.out.println(st3.hashCode());
		
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
		
		

	}
	
	
}

 class Student {
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	public int hashCode() {
		return roll;
	}
	
	public boolean equals(Object obj) {
		return(this.hashCode() == obj.hashCode());
	}
}

