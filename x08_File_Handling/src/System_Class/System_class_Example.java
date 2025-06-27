package System_Class;

import java.util.*;

public class System_class_Example {

    public static void main(String[] args) {

        System.out.println("------ SYSTEM CLASS DEMO STARTED ------\n");

        // 1️⃣ System.out.println() - Standard output
        System.out.println("✅ Hello from System.out.println!");

        // 2️⃣ System.err.println() - Error output stream
        System.err.println("⚠️ This is printed using System.err");

        // 3️⃣ System.in - Reading input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("📥 Enter your name: ");
        String name = sc.nextLine();
        System.out.println("👋 Hello, " + name + "!");

        // 4️⃣ System.currentTimeMillis() - Time in milliseconds
        long millis = System.currentTimeMillis();
        System.out.println("⏱️ Current time in milliseconds: " + millis + " ms");

        // 5️⃣ System.nanoTime() - High-resolution time (useful for benchmarking)
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {}  // dummy loop
        long end = System.nanoTime();
        System.out.println("⏲️ Loop time taken in nanoseconds: " + (end - start) + " ns");

        // 6️⃣ System.getProperty() - Specific system properties
        System.out.println("🖥️ OS Name: " + System.getProperty("os.name"));
        System.out.println("🧠 Java Version: " + System.getProperty("java.version"));
        System.out.println("📁 User Directory: " + System.getProperty("user.dir"));

        // 7️⃣ System.getProperties() - All properties
        System.out.println("\n🔍 Listing all system properties:");
        Properties props = System.getProperties();
        props.list(System.out);

        // 8️⃣ System.getenv() - Environment variables
        System.out.println("\n🌍 Environment Variables:");
        Map<String, String> env = System.getenv();
        for (String key : env.keySet()) {
            System.out.println(key + " = " + env.get(key));
        }
        
        System.out.println();
        
        // 9️⃣ System.arraycopy() - Copying array content
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[5];
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.print("📦 Copied array using arraycopy: ");
        for (int num : dest) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        // 🔟 System.gc() - Suggest Garbage Collection
        System.out.println("🧹 Calling garbage collector using System.gc()");
        System.gc();  // Note: JVM decides whether to run GC

        // 1️⃣1️⃣ System.exit() - Uncomment below line to terminate program manually
        // System.exit(0);  // 0 = normal exit, non-zero = abnormal

        System.out.println("\n------ SYSTEM CLASS DEMO COMPLETED ------");

        sc.close(); // Closing Scanner
    }
}


/*
Method:- 						Description
System.out.println()			Prints to console
System.err.println()			Prints error to console
System.in						Reads input from keyboard
System.currentTimeMillis()		Returns current time in milliseconds
System.nanoTime()				High-resolution time for measuring performance
System.exit(status)				Terminates the JVM
System.getProperties()			Returns all system properties
System.getProperty(String)		Gets a specific system property
System.getenv()					Gets all environment variables
System.arraycopy()				Copies data from one array to another
System.gc()						Requests garbage collection

*/