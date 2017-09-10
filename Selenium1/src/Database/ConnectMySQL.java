package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class ConnectMySQL {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dufry","root","selenium");
		
		System.out.println("Connected with database");
		
		
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from employees");
		
		
		
		while (rs.next()) {
	
			String FirstName=rs.getString("FirstName");
			System.out.println("Database record Firstname  is " +FirstName);
			/*String LastName=rs.getString("LastName");
			System.out.println("Database record is "+ LastName);
			String Position=rs.getString("Position");
			System.out.println("Database record is " +Position);
			*/
			
		}
			
			
	}
	
		@Test
		public void testDB2() throws ClassNotFoundException, SQLException {
		
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","selenium");
			
			System.out.println("Connected with database");
			
			
			Statement stm=con.createStatement();
			
			ResultSet rs=stm.executeQuery("select * from seleniumuser");
			
			
			
			while (rs.next()) {
				
				String firstname = rs.getString("firstname");
				System.out.println(firstname);
		
				String emai = rs.getString("emai");
				System.out.println(emai);
		
		
		
		
		
		
		
		
	}
	
	
		}
		}
	
	
	
	
	


