package Set_Interface;

import java.util.TreeSet;



public class TreeSet_creation {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();                                  // HashSet   , LinkedHashSet ,TreeSet
		set.add(20);
		set.add(30);
		set.add(60);
		set.add(50);
		set.add(90);
		set.add(10);
		
		set.remove(90);      //Removes 90 from TreeSet
		set.contains(20);    //Checks if TreeSet contains 20 or not
		
		
		//set.add("Java");     //RunTime ClassCastException: 
		System.out.println(set);      //[10, 20, 30, 50, 60, 90]   // No Duplicates and Heterogenous DataType  allowed and always Sorted
		System.out.println(set.reversed());
		
		//elemnts are sorted 
		System.out.println();
		for(Object x : set) {
			System.out.println(x);
		}
	}

}
