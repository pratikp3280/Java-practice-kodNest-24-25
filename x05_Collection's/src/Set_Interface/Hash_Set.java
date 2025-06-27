package Set_Interface;

import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet set = new HashSet();                                  // HashSet   
		set.add(20);
		set.add("KodNest");
		set.add("Java");
		set.add(50);
		set.add(90);
		set.add(10);
		
		
		set.remove(10);      //Removes 10 from HashSet
		set.contains(20);    //Checks if HashSet contains 20 or not
		
		
		set.add("Python");          
		System.out.println(set);     //[Java, 50, 20, 90, KodNest, Python] // No Duplicates But Heterogenous DataTypes  allowed and always Unordered NotSorted
		
		
		
		
		//elemnts are  Unorderly added and Printed
		System.out.println();
		for(Object x : set) {
			System.out.println(x);
		}
	}

	}


