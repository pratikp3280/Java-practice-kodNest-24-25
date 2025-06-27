package Concurrent_Collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class Copy_On_Write_ArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Initial List: " + list);

        // Modifying the list while iterating
        for (String fruit : list) {
        	
            System.out.println("Reading: " + fruit);   // Reading an elements through iterators
            
            list.add("Mango");  // simultaneous modification BUT No ConcurrentModificationException
        }

        System.out.println("Updated List: " + list);
    }
}


// it creates a new copy of the list.
// A thread-safe version of ArrayList
// Avoids ConcurrentModificationException.

/* Output:
Initial List: [Apple, Banana, Cherry]
Reading: Apple
Reading: Banana
Reading: Cherry
Updated List: [Apple, Banana, Cherry, Mango, Mango, Mango]*/
