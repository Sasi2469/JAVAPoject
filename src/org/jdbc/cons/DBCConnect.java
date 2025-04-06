package org.jdbc.cons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.OracleDriver;
public class DBCConnect {

	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// load the driver
		Class.forName("oracle.jdbc.OracleDriver");
		
		// establish connection
	       Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
	       //create statement
	       Statement statement = connection.createStatement();
	       
	     System.out.println( statement.execute("select * from employees"));
	       
	     
	       ResultSet executeQuery = statement.executeQuery("select * from Employees");
	                             
	      
	       
	while(  ! executeQuery.next() == false ) {
		
		System.out.println(executeQuery.getString("First_name")+"    "+ executeQuery.getString("last_name"));
	}
	    
	       PreparedStatement statement2 = connection.prepareStatement("insert into product_details values(?,?, ?)");
	
	       statement2.setInt(1,364785);
	       statement2.setString(2,"bike");
	       statement2.setInt(3,21);
	       
	       int executeUpdate = statement2.executeUpdate();
	       
	       System.out.println(executeUpdate);
	       
	executeQuery.close();
	statement.close();
	connection.close();
	}
	
	
	  
	
	
}
