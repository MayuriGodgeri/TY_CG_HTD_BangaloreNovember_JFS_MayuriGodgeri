package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);

	Connection con=null;
	//Statement stmt=null;
	PreparedStatement pstmt=null;
    ResultSet rs=null;
try{
	//load the driver
	Driver driver=new com.mysql.jdbc.Driver();
	DriverManager.registerDriver(driver);
	System.out.println("driver loaded.....");
	
	//get DB connection via Driver
	String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
	System.out.println("enter user name and password");
	String dbUser=sc.nextLine();
	String dbPassword=sc.nextLine();
	
	con = DriverManager.getConnection(dbUrl,dbUser,dbPassword);
	System.out.println("connection established"); 
	
	//issue sql queries via connection
	/*String query="select * from users_info where userid=1 and password='qwerty12'";
	stmt= con.createStatement();
	rs= stmt.executeQuery(query);*/
	
	String query="select * from users_info where userid=? and password=?";
	pstmt=con.prepareStatement(query);
	
	System.out.println("enter userid...");
	pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
	System.out.println("enter password");
	pstmt.setString(2,sc.nextLine());
	rs=pstmt.executeQuery();
	System.out.println("query executed");
	if(rs.next()) {
		
		System.out.println("userid: "+rs.getInt(1));
		System.out.println("username: "+rs.getString(2));
		System.out.println("email: "+rs.getString(3));
		}else {
			System.err.println("something went wrong");
		}
}
catch (SQLException e) {
	e.printStackTrace();
}

finally {
	if(con!=null) 
		try {
			con.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		if(pstmt!=null)
		try {
			
			pstmt.close();
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
