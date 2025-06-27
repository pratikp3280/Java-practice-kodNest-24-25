package I_O_Effective_usage;

import java.io.*;

public class Use_DataInput_OutputStream {
    public static void main(String[] args) {
        try {
            // Write binary data (int, double) to file
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
            dos.writeInt(10);
            dos.writeDouble(99.99);
            dos.close();

            // Read the data back
            DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"));
            int num = dis.readInt();
            double price = dis.readDouble();
            dis.close();

            System.out.println("Read from file: " + num + ", " + price);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// for Binary + Primitives