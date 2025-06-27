package I_O_Effective_usage;

import java.io.*;

public class Use_BufferedReader {
    public static void main(String[] args) {
        try {
            // Create a FileReader wrapped in BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println("Line: " + line);
            }

            reader.close(); // Always close
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Buffers chunks of characters for faster reading.
// Reading a large text file like a server log or chat history.