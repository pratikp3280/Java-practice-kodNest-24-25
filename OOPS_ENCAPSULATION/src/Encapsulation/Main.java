package Encapsulation;

public class Main {
	public static void main() {
		Student std1 = new Student();
		std1.age = -3;
		System.out.println(std1.age);
		
		std1.setData(-15);
		System.out.println(std1.getData());
	}
}
