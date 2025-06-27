
public class StudentAPP {

	public static void main(String[] args) {
		//Creating the Object s1 of Student
		STUDENT  s1 = new STUDENT();
		//Assigning values 
		s1.id = 1;
		s1.name = "Rohit";
		s1.age = 25;
		
		s1.eat();
		s1.Prepare();
		s1.code();
		
		System.out.println(s1.name+" is Eating.");

	}

}
