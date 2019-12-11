package com.caps.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MyFirstJdbc
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
	    ResultSet rs=null;
	try {
		//load the driver
		Driver driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("driver loaded.....");
		
		//get DB connection via Driver
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
		con = DriverManager.getConnection(dbUrl);
		System.out.println("connection established"); 
		
		//issue sql queries via connection
		String query="select * from users_info ";
		stmt= con.createStatement();
		rs= stmt.executeQuery(query);
		System.out.println("Querry issued");
		System.out.println("---------------------");
		//process the results returned by sql querries
		while(rs.next()) {
			
			System.out.println("userid: "+rs.getInt("userid"));
			System.out.println("username: "+rs.getString("username"));
			System.out.println("email: "+rs.getString("email"));
			System.out.println("password: "+rs.getString("password"));
			System.out.println("---------------------");
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	finally {
		if(con!=null) 
			try {
				con.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			if(stmt!=null)
			try {
				
				stmt.close();
			} catch(SQLException  e2) {
				e2.printStackTrace();
			}
			if(rs!=null)
			try {
				
				rs.close();
			} catch(SQLException  e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
