package DB_Connection;

import java.sql.*;

public class DataHandler {

	  public static void insertData(String unmae , String password) {
		  //DBconnection
	        String  URL = "jdbc:mysql://localhost:3306/JAVA_PROJECT";
	        String Uname = "root";
	        String PSW  = "Pratik@123.in";
	        String sql = "INSERT INTO customers Values(?, ?)";
	        
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection conn = DriverManager.getConnection(URL , Uname , PSW);
	                   
	    		PreparedStatement ps = conn.prepareStatement(sql);
	    		ps.setString(1, "uname");
	    		ps.setString(2, "password");
	    		ps.executeUpdate();
	    		
	    		
	        } 
		  catch (Exception e) {
	            e.printStackTrace();
	            e.getMessage();
	           
	        }
	    }
	}

