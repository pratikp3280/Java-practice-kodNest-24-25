package I_O_Effective_usage;

import java.io.*;

public class Copy_Any_File_using_BufferedInputStream {
    public static void main(String[] args) {
        try (
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("original.jpg"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
        ) {
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// Always use BufferedInputStream or BufferedOutputStream when copying large files.