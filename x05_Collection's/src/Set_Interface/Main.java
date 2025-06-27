package Set_Interface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of operations: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume the newline
        
        // Implement TreeSet logic here
        TreeSet<String>  set = new TreeSet<>();
        
        
        // Write your code here
      
        for(int i = 0 ; i < n ;i++) {
        	  System.out.println("Enter the  operation: ");
        	String operation = sc.nextLine();
        	String[] parts = operation.split(" ");
        	String command = parts[0];
        	
        	if(command.equals("ADD")) {
        		String lang = parts[1];
        		set.add(lang);
        	}
        	else if(command.equals("REMOVE")) {
        		String lang = parts[1];
        		set.remove(lang);
        	}
        	else if(command.equals("FIRST")) {
        		String lang = parts[1];
        		System.out.println(set.first());
        	}
        	else if(command.equals("LAST")) {
        		String lang = parts[1];
        		
        		System.out.println(set.last());
        		
        	}
        	else if(command.equals("PRINT")) {
        		String lang = parts[1];
        		
        		for(Object x : set) {
        			System.out.print(x+" ");
        		}
        		
        	}
        	else if(command.equals("CHECK")) {
        		String lang = parts[1];
        		if(set.contains(lang)) {
        			System.out.println("YES");
        		}
        		else {
        			System.out.println("NO");
        		}
        	}
        	
        }
    }
}