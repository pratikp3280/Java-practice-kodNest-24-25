package Types_File_handling;

import java.io.*;

public class Character_Based_Handling {
    public static void main(String[] args) {
        try {
            // 1. Create a FileWriter for a text file to store the caption
            FileWriter writer = new FileWriter("caption.txt");

            // 2. Write the caption into the file
            writer.write("This is a memory from our 2025 picnic at the waterfalls 🏞️!");

            // 3. Close the writer
            writer.close();

            System.out.println("📝 Caption saved successfully!");

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}


/*  
 * Character-based = text data (logs, CSV,Txt , XML , HTML)
 * Deals with text data (characters). It interprets bytes as characters based on encoding like UTF-8.
 * Java classes used:
					FileReader
					FileWriter
					BufferedReader
					BufferedWriter
					PrintWriter
					
 */