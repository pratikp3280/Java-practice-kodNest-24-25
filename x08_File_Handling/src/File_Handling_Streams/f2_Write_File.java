package File_Handling_Streams;

import java.io.FileWriter;
import java.io.IOException;

public class f2_Write_File {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("notes.txt");
            
            writer.write("Learning Java File Handling is FUN! ✨");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
