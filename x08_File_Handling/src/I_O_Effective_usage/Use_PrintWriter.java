package I_O_Effective_usage;
import java.io.*;

public class Use_PrintWriter {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("report.txt")) {
        	
            pw.println("Report:");
            pw.printf("Name: %s, Score: %d\n", "Rahul", 95);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// for Pretty Printing (Formatted Output)