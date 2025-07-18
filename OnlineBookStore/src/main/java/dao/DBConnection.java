package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	// Database URL (connects to your MySQL DB running locally)
    private static final String URL = "jdbc:mysql://localhost:3306/online_bookstore";
 // Username and password 
    private static final String USER = "root";
    private static final String PASSWORD = "Pratik@123.in";

    // Public method to return a live DB connection
    public static Connection getConnection() {
        Connection conn = null;
        try {
        	// Load the MySQL JDBC driver (required once)
            Class.forName("com.mysql.cj.jdbc.Driver");
         // Establish connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();    // Print any connection or driver loading errors
        }
        return conn;
    }
}


/* 
 *getConnection() - It lets us connect to MySQL from anywhere in our project with just one line:
 * Connection conn = DBConnection.getConnection();
 *
 * */
 