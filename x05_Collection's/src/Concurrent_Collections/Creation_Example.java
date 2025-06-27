package Concurrent_Collections;

import java.util.*;

public class Creation_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		//Using for loop
		for(int i =0 ; i < list.size();i++ ) {
			//Accessing List Elements
			System.out.println(list.get(i));
			
			//Adding elemnts to List
			list.add(100);
		}
		
		//BUT - For Fail-fast classes
		//Using for-Each loop - ConcurrentModificationException 
		for(int o : list ) {
			//Accessing List Elements
			System.out.println(o);
			
			//Adding elemnts to List
			list.add(100);
		}

	}

}

/* 
✔  ConcurrentHashMap:     Best for thread-safe key-value storage, allows high-performance concurrent modifications.
✔ CopyOnWriteArrayList:   Best for read-heavy scenarios, but expensive for writes.
✔ ConcurrentLinkedQueue:  Best for multi-threaded queues, efficient producer-consumer handling.
 **/
