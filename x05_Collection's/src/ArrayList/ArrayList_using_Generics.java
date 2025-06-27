package ArrayList;

import java.util.ArrayList;

public class ArrayList_using_Generics {

	public static void main(String[] args) {
		//Generics are used for Type Safety and code Reusability
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rohit");
		list.add("Virat");
//		list.add(7);       //Compile-Time-Error because Generics with a Specific(String) Type used but Integer given
		list.add("Jasprit");
		list.add("Pant");
		
		System.out.println(list);
	}

}
