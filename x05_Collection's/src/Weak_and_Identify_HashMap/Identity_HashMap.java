package Weak_and_Identify_HashMap;

import java.util.IdentityHashMap;
//An IdentityHashMap  : Keys are compared by reference (==) instead of .equals().
//Even if two objects have the same .equals() value, they will be treated as different keys.

public class Identity_HashMap {
    public static void main(String[] args) {
        IdentityHashMap<String, String> identityMap = new IdentityHashMap<>();

        String key1 = new String("Java");
        String key2 = new String("Java");

        identityMap.put(key1, "Object 1");
        identityMap.put(key2, "Object 2"); // Treated as a different key!

        System.out.println(identityMap);
        
        //Output: {Java=Object 1, Java=Object 2}
        //Two separate entries exist, even though key1.equals(key2) is true, because IdentityHashMap compares references (==) instead of values.
    }
}

