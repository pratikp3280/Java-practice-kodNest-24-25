package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Generics_Wildcard {

	public static void main(String[] args) {
		
//		ArrayList<Object> list = new ArrayList();
//		
//		list.add(10);
//		list.add("kod");
//		list.add(2.03);
//		list.add(true);
//		list.add('a');
//		
//		//accessing List elements using for loop
//		
//		System.out.println("Printing arrayList elements:(Using for loop)");
//		for(int i = 0; i < list.size() ; i++) {
//			System.out.print(list.get(i) + " ");
//		}
//		System.out.println();
//		
//		
//		//accessing List elements using for-each loop
//		System.out.println("Printing arrayList elements:(Using for-Each loop)");
//				for(Object ele : list) {
//					System.out.print(ele + " ");
//				}
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Printlist(list);
		
		List<String> strlist = new ArrayList<String>();
		strlist.add("Java");
		strlist.add("Pyhton");
		strlist.add("MongoDB");
		strlist.add("SQL");
		Printlist(strlist);
		
		Student s1 = new Student(1 , "Jon");
		Student s2 = new Student(2 , "Alice");
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(s1)
		stdList.add(s2);
	
	}
	
	public static void Printlist(List<?> list) {
		//System.out.println("Printing arrayList elements:(Using for-Each loop)");
		for(Object ele : list) {
			System.out.print(ele + " ");
		}
	}
	
	class Student {
		int roll;
		String name;
		
		public Student(int roll, String name) {
			this.roll = roll;
			this.name = name;
		}
		
	}

}
