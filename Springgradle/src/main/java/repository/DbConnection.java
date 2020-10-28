package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import service.EmployeeImpl;

public class DbConnection {
	final static Logger logger = Logger.getLogger(DbConnection.class);
	public  static Connection getConnection() {
		 String url = "jdbc:mysql://localhost:3306/test";
			String name = "root";
			String pass = "root";
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 con = DriverManager.getConnection(url, name, pass);
				
			} catch (SQLException e) {
			System.out.println("Connection failed");
			} catch (ClassNotFoundException e) {
				System.out.println("Driver not loaded");
			}
			return  con;
		
	
}
}
	
