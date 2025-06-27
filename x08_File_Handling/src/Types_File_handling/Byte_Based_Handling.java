package Types_File_handling;

import java.io.*;

public class Byte_Based_Handling {
    public static void main(String[] args) {
        try {
            // 1. Open the source image (simulate the photo taken)
            FileInputStream input = new FileInputStream("source.jpg"); 

            // 2. Create a new file to store the copied image
            FileOutputStream output = new FileOutputStream("saved_photo.jpg");

            // 3. Read byte by byte and write
            int data;
            while ((data = input.read()) != -1) {
                output.write(data);  // copy byte to output
            }

            // 4. Close the files
            input.close();
            output.close();

            System.out.println("📸 Photo saved successfully!");

        } catch (IOException e) {
            System.out.println("Oops! Something went wrong: " + e);
        }
    }
}


/* 
 * Byte-based file handling (used for images, PDFs, audio files)
 * Java classes used:
                    FileInputStream
					FileOutputStream
					BufferedInputStream
					BufferedOutputStream
					

 * */
 