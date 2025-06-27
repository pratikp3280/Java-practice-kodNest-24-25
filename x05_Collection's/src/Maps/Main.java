package Maps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a TreeMap to store flight schedules
        TreeMap<String, String> map = new TreeMap<String, String>();

        // Reading number of flights
        int n = sc.nextInt();
        sc.nextLine();  

        // Reading flight details
        for (int i = 0; i < n; i++) {
            String flight = sc.nextLine();  // Flight name
            String time = sc.nextLine();    // Flight time
            map.put(time, flight);
            System.out.println("Added: " + flight + " at " + time);
        }
        
        // Retrieve and display flight details for a given time
        String yourTime = sc.next();
        sc.nextLine();
         

        if (map.containsKey(yourTime)) {
            String yourFlight = map.get(yourTime);
            System.out.println("Flight at " + yourTime + ": " + yourFlight);
        } else {
            System.out.println("Flight not found");
        }

        // Remove a flight based on the given time
        String removeTime = sc.next();
        sc.nextLine();
        if (map.containsKey(removeTime)) {
            String removedFlight = map.remove(removeTime);
            System.out.println("Flight removed: " + removedFlight + " at " + removeTime);
        } else {
            System.out.println("Flight not found");
        }

        // Print all remaining flight schedules in chronological order
        System.out.println();
        System.out.println("All Available Flights: ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}

