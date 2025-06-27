package Prioority_Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Priority_Que_Creation {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.add(10);
		q.add(5);
		q.add(30);
		q.add(25);
		q.add(15);
		q.add(90);
		System.out.println(q);
		
		PriorityQueue q2 = new PriorityQueue();
		q2.add("Jon");
		q2.add("Bob");
		q2.add("Alice");
		q2.add("Cat");
		q2.add("Devid");
		q2.add("Emma");
		System.out.println(q2);
		
		Object[] arr = q.toArray();
		
		Arrays.sort(arr);
		
		
	}

}
