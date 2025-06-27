package ArrayList;

import java.util.ArrayList;

import java.util.*;

public class Arraylsit_example_3 {

	public static void main(String[] args) {	
//		list.add(30);
//		list.add(20);
//		list.add(100);
//		list.add(40);
//		list.add(50);
//		
//		System.out.print("Original List: ");
//		System.out.println(list);
//		
//		Collections.sort(list);
		
		
		Student st1 = new Student(10, "raj", 8.1);
		Student st2 = new Student(2, "Amit", 8.2);
		Student st3 = new Student(7, "Sumit", 8.3);
		
		
		ArrayList list = new ArrayList();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		System.out.println("Original List: ");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.print("Sorted List: " + list);
		
	}

}

class Student implements Comparable {
	int roll;
	String name;
	double cgpa;
	
	// Student class Constructor
	public Student(int roll, String name,double cgpa) {
		super();
		this.roll = roll;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name= " + name + ", cgpa= " + cgpa + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student st = (Student) o;
		
		if(this.cgpa > st.cgpa) {
			return 1;              // 1st objecct is > 2nd objecct 
		}
		if(this.cgpa < st.cgpa) {
			return -1;             // 1st objecct is < 2nd objecct 
		}
		
		return 0;					//1st objecct is =  2nd objecct
	}
	
	@Override
	public int compareTo(Object o) {
		Student st = (Student) o;
		
		
	}

}

class Organiser implements Comparator {
	@Override
	public int compare(Object o1 , Object o2) {
		Student st1 = (Student) o1;
		Student st2 = (Student) o2;
		
		if(st1.cgpa > st2.cgpa) {
			return 1;              // 1st objecct is > 2nd objecct 
		}
		if(st1.cgpa < st2.cgpa) {
			return -1;             // 1st objecct is < 2nd objecct 
		}
		
		return 0;					//1st objecct is =  2nd objecct
	}
		
	}
	
	
}



