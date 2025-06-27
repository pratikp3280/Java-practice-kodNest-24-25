package Maps;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Creation {

	    public static void main(String[] args) {
	        HashMap<String, String> map = new HashMap<>();
	        
	        // Adding key-value pairs
	        map.put("USA", "Washington, D.C.");
	        map.put("India", "New Delhi");
	        map.put("Canada", "Ottawa");
	        
	        // Retrieving a value
	        System.out.println("Capital of India: " + map.get("India"));
	        
	        // Checking if a key exists
	        System.out.println("Does map contain USA? " + map.containsKey("USA"));
	        
	        // Removing a key-value pair
	        map.remove("Canada");
	        
	        // Checking the size of the map
	        System.out.println("Size of map: " + map.size());
	        
	        // Iterating through key-value pairs
	        for (Map.Entry<String, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	        
	        // Checking if the map is empty
	        System.out.println("Is map empty? " + map.isEmpty());
	    }
	}
