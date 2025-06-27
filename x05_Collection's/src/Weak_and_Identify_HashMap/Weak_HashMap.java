package Weak_and_Identify_HashMap;

import java.util.WeakHashMap;

//A WeakHashMap : keys are stored as weak references. 
// If a key has no strong reference elsewhere, the Garbage Collector (GC) will automatically remove the key-value pair from the map.
class Weak_HashMap {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<Object, String> weakMap = new WeakHashMap<>();
        Object key1 = new Object(); // Strong reference key
        Object key2 = new Object(); // Another strong reference key

        weakMap.put(key1, "Value 1");
        weakMap.put(key2, "Value 2");

        System.out.println("Before GC: " + weakMap);

        // Remove strong reference
        key1 = null;  // key1 is now eligible for GC
        System.gc();   // Request GC to run

        Thread.sleep(1000); // Give GC some time

        System.out.println("After GC: " + weakMap); // Key1 is removed automatically after GC because no strong reference was pointing to it.
    }
}
