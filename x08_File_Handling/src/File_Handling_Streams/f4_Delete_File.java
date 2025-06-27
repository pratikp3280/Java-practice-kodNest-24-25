package File_Handling_Streams;

import java.io.File;

public class f4_Delete_File {
    public static void main(String[] args) {
    	
        File myFile = new File("notes.txt");
        
        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
