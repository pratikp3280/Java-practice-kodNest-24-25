package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_using_Generics {

	public static void main(String[] args) {
		//Generics are used for Type Safety and code Reusability
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(50);    
		list.add(70); 
		list.add(90);    
//		list.add("Virat");     //Compile-Time-Error because Generics with a Specific(Integer) Type used but String given
		list.add(100);    
		
		System.out.println(list);
	}

}
