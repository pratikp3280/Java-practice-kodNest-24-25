package I_O_Effective_usage;

import java.io.*;

public class Use_try_with_resources {
    public static void main(String[] args) {
    	
        // Automatically closes the writer, even if an error occurs
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("This is best practice!");
        }
        
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// The file will be automatically closed at the end of the try block — no need for writer.close().