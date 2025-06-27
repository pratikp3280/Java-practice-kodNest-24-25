package Types_File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_BufferedWriter_Example {

	public static void main(String[] args) throws InterruptedException {
		
		String filepath = "sample.txt";
		
		 // Writing using BufferedWriter
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))){
			System.out.println("Writing... in the file: " + filepath);
			bw.write("Hello world ! This is First Line");
			bw.newLine();
			bw.write("Hello world ! This is Second Line");
			bw.newLine();
			bw.write("Hello world ! This is Third Line");
			bw.flush(); // Optional here since close() will also flush
			Thread.sleep(2000);
			System.out.println("Writing completed.");
		}
		catch (IOException e) {
			System.out.println("Error in writing: " + e.getMessage());
		}
		
		
		Thread.sleep(3000);
		
		 // Reading using BufferedReader
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))){
			String Line;
			System.out.println("Reading... in the file: " + filepath);
			Thread.sleep(2000);
			while((Line = br.readLine()) != null ) {
				System.out.println(Line);  // Print each line after reading
				Thread.sleep(2000);
			}
			
			System.out.println("Reading completed.");
			
		}
		catch (IOException e) {
			System.out.println("Error reading: " + e.getMessage());
		}

	}

}


/* Real-World Usage of Buffered Streams
						1.Text editors like Notepad++ or VS Code (fast file reading/writing).
						2.Loggers in backend systems (writing logs efficiently).
						3.Configuration file readers (.properties, .ini files in apps).
*/
