package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate
{
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement pstmt=null;
	Scanner sc=new Scanner(System.in);
	try {
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver has been loaded");
		
		//get db connection
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("enter db user and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		con=DriverManager.getConnection(dbUrl, user, password);
		System.out.println("connection established");
		
		//issue sql query
		String query="update users_info set email=? where userid=? and password=?";
		pstmt=con.prepareStatement(query);
		System.out.println("enter userid");
		pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
		System.out.println("enter email");
		pstmt.setString(1,sc.nextLine());
		System.out.println("enter password");
		pstmt.setString(3,sc.nextLine());
		
		int count=pstmt.executeUpdate();
		System.out.println("query issued");
		
		//process resultant query
		if(count>0)
		{
			System.out.println("query ok "+count+ " rows affected");
		}
		else
		{
			System.err.println("something went wrong");
		}
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	finally {
		if(con!=null) 
			try {
				con.close();
			} catch (Exception e) {

				e.printStackTrace();
			}
		if(pstmt!=null)
			try {

				pstmt.close();
			} catch(Exception  e2) {
				e2.printStackTrace();
			}

}
	sc.close();
}
}
