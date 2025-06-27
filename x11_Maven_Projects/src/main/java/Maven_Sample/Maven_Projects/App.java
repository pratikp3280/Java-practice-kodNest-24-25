package Maven_Sample.Maven_Projects;

import java.sql.*;

public class App {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/JAVA_PROJECT";  // your DB
		String uname = "root";             // your MySQL username
		String pass = "Pratik@123.in";     // your MySQL password
		
        try {
        	
            Connection con = DriverManager.getConnection(url, uname, pass);
            System.out.println("✅ Connection successful!");
            con.close();
        } 
        catch (Exception e) {
        	
            System.out.println("❌ Connection failed!");
            e.printStackTrace();
            
        }
    }
}
