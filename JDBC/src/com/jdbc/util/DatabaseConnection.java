package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String args[]) {
	 Connection connection = null;
	 Statement statement = null;
	   try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Company", "postgres",
					"postgres");
            connection.setAutoCommit(false);
			System.out.println("opened database succesfully");
			statement = connection.createStatement();
			
			statement.close();
			connection.commit();
			connection.close();
            
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Records Created Successfully");
        }
    
         
    
        
    
	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return getConnection();
	}
	    

}
