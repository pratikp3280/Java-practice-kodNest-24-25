package File_Handling_Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class f3_Read_File {
    public static void main(String[] args) {
        try {
            File myFile = new File("notes.txt");
            
            Scanner read = new Scanner(myFile);
            
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println("Reaing a file: " + myFile.getName() +"\n"+ data);
            }
            
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
