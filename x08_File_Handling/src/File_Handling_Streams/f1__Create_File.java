package File_Handling_Streams;

import java.io.File;
import java.io.IOException;

public class f1__Create_File {
    public static void main(String[] args) {
        try {
            File myFile = new File("notes.txt");
            
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } 
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
