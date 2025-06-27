package I_O_Effective_usage;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Use_Exception_Handling {
    public static void main(String[] args) {

        // First, write to the file
        try (FileWriter writer = new FileWriter("output.txt")) {
        	
            writer.write("Hello from Java!\n");
            writer.write("This file was written and now will be read.\n");
            
            System.out.println("✅ Data written to 'output.txt'.");
            
        }
        catch (IOException e) {
            System.out.println("🚫 Error writing to the file: " + e.getMessage());
            return; // Stop the program if writing failed
        }

        // Then, read from the same file
        try (FileReader reader = new FileReader("output.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            System.out.println("\n📖 Reading from 'output.txt':");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("➡️ " + line); // Print each line read
            }

        } 
        catch (IOException e) {
            System.out.println("🚫 Error reading from the file: " + e.getMessage());
        }
    }
}
