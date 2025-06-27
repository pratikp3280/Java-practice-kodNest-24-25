package File_Handling_Streams;

import java.io.File;
import java.io.IOException;

public class File_class {

    public static void main(String[] args) {
        try {
            System.out.println("------ FILE CLASS DEMO STARTED ------");

            // 1️⃣ Create a file object pointing to "demoFile.txt"
            File file = new File("demoFile.txt");

            // 2️⃣ createNewFile() - Creates file if not exists
            if (file.createNewFile()) {
                System.out.println("✅ File created: " + file.getName());
            } else {
                System.out.println("⚠️ File already exists.");
            }

            // 3️⃣ exists() - Check if the file exists
            System.out.println("📌 File exists: " + file.exists());

            // 4️⃣ getName() - Get the file name
            System.out.println("📄 File Name: " + file.getName());

            // 5️⃣ getAbsolutePath() - Full path of the file
            System.out.println("📍 Absolute Path: " + file.getAbsolutePath());

            // 6️⃣ canRead() - Check read permission
            System.out.println("📖 Can Read: " + file.canRead());

            // 7️⃣ canWrite() - Check write permission
            System.out.println("✏️ Can Write: " + file.canWrite());

            // 8️⃣ isFile() - Is it a file?
            System.out.println("📦 Is it a File? " + file.isFile());

            // 9️⃣ length() - File size (will be 0 now since we didn't write anything)
            System.out.println("📏 File Size (bytes): " + file.length());

            // 🔟 isDirectory() - Check if it's a directory (should be false)
            System.out.println("📁 Is it a Directory? " + file.isDirectory());

            // 1️⃣1️⃣ Create a directory using mkdir()
            File folder = new File("MyTestFolder");
            if (!folder.exists()) {
                folder.mkdir(); // Create folder
                System.out.println("📂 Directory created: " + folder.getName());
            }

            // 1️⃣2️⃣ Create files inside the directory
            File f1 = new File("MyTestFolder/file1.txt");
            File f2 = new File("MyTestFolder/file2.txt");
            f1.createNewFile();
            f2.createNewFile();
            System.out.println("📄 Files created in folder.");

            // 1️⃣3️⃣ list() - List contents of a directory
            System.out.println("📜 Listing all files  of MyTestFolder:");
            String[] fileList = folder.list();
            for (String name : fileList) {
                System.out.println("   - " + name);
            }

            // 1️⃣4️⃣ delete() - Let's delete one file
            if (f1.delete()) {
                System.out.println("🗑️ Deleted file: " + f1.getName());
            }

            // 1️⃣5️⃣ Delete the file created initially
            if (file.delete()) {
                System.out.println("🧹 Cleaned up: Deleted demoFile.txt");
            }

            // 1️⃣6️⃣ Delete directory (only works if empty)
            if (f2.delete()) {
                System.out.println("🧹 Deleted file2.txt");
            }
            if (folder.delete()) {
                System.out.println("📁 Directory deleted: " + folder.getName());
            }

            System.out.println("------ FILE CLASS DEMO COMPLETED ------");

        } catch (IOException e) {
            System.out.println("❌ An error occurred:");
            e.printStackTrace();
        }
    }
}



/* File class in Java is part of the java.io package
 * Note: File does not actually read or write data inside the file. It's for file management only.
 * 	Create files or directories
	Delete files or directories
	Check if a file exists
	Get file info (like name, path, size)
	List files in a directory
 *
 * Method:-				Description	:-						Example Usage:-
createNewFile()			Creates a new empty file			file.createNewFile();
mkdir()					Creates a new directory				new File("folder").mkdir();
exists()				Checks if file/directory exists		file.exists();
delete()				Deletes the file/directory			file.delete();
getName()				Returns the name of the file		file.getName();
getAbsolutePath()		Full path of the file				file.getAbsolutePath();
canRead()				Checks read permission				file.canRead();
canWrite()				Checks write permission				file.canWrite();
length()				Returns file size in bytes			file.length();
list()					Lists files in a directory			file.list(); (returns String[])
isDirectory()			Checks if path is directory			file.isDirectory();
isFile()				Checks if path is file				file.isFile();
 * 
 * */
 