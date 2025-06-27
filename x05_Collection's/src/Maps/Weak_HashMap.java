package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Weak_HashMap {

	public static void main(String[] args) {
		
		String k1 = new String("Key1");
		String v1 = new String("value1");
		String k2 = new String("Key2");
		String v2 = new String("value2");
		
		Map hashMap = new HashMap();
		hashMap.put(k1 ,  v1);
		
		Map weakMap = new WeakHashMap<>();
		weakMap.put(k2 ,  v2);
		
		System.out.println( "From HashMap " + hashMap);
		System.out.println( "From Weak HashMap " + weakMap);
		
		k1 = null;
		k2 = null;
		
		System.gc();
		
		System.out.println("From HashMap " + hashMap);
		System.out.println("From Weak HashMap " + weakMap);
	        
	      
	}

}
