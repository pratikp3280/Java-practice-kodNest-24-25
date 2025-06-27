package ArrayList;

import java.util.ArrayList;

public class Array_list_Ex_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println("The Size of the ArrayList is : " + list.size());
		System.out.println();
		System.out.println("ArrayList: " + list);
		
		for(int i = 0;  i < list.size() ;i++) {
			int num = (int) list.get(i);                    
			int result = num * 10;                         //or     (list.get(i) * 10 );
			System.out.println(result);          
		}
		
	
		
		

	}

}
