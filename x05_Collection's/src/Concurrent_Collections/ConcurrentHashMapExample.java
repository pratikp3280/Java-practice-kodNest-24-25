package Concurrent_Collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Adding elements
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("Initial Map: " + map);

        // Removing an element
        map.remove(2);

        // Updating a value
        map.put(3, "JavaScript");

        System.out.println("Updated Map: " + map);
    }
}

// allows concurrent reads and writes.
// Performs better than Hashtable 
//  Prevents ConcurrentModificationException.