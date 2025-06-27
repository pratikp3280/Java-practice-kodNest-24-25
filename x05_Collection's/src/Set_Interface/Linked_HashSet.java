package Set_Interface;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();                                  // HashSet   
		set.add(20);
		set.add("KodNest");
		set.add("Java");
		set.add(3.14);
		set.add(50);
		set.add(90);
		set.add(10);
		
		
		set.remove(10);      //Removes 10 from LinkedHashSet
		set.contains(20);    //Checks if LinkedHashSet contains 20 or not
		
		
		set.add("Python");          
		System.out.println(set);     //[20, KodNest, Java, 3.14, 50, 90, Python] // No Duplicates But Heterogenous DataTypes  allowed and always orfered  NotSorted
		System.out.println(set.reversed());
		
		//elemnts are Added in Orderly and Printed Orderly
		System.out.println();
		for(Object x : set) {
			System.out.println(x);
		}
	}

}
