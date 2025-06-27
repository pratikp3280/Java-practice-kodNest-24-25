package Serialization_DeSerialization;

public class Costructs_Example {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		
		
		System.out.println("Number of Objects Created = " + Student.obj);
		//Output : - 4 Objects Created
		
	}

}

class Student{
	
	static int obj = 0;
	
	Student() {
		obj++;
	}
}
