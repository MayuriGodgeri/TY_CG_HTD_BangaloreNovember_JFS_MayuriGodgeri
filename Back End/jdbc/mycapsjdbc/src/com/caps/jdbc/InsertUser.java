package com.caps.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		//load the driver
		try {
			//Driver Driver=new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(Driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			//get db connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter db user and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl, user, password);
			System.out.println("connection established......");
			//isuue sql query
			String query="insert into users_info(userid,username,email,password) values(?,?,?,?) ";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter userid..");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("enter username..");
			pstmt.setString(2,sc.nextLine());
			System.out.println("enter mail..");
			pstmt.setString(3,sc.nextLine());
			System.out.println("enter password..");
			pstmt.setString(4,sc.nextLine());
			

			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("user inserted......");
			}else {
				System.err.println("something went wrong");
			}

			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if(conn!=null) 
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			if(pstmt!=null)
				try {

					pstmt.close();
				} catch(SQLException  e2) {
					e2.printStackTrace();
				}


		}
	}
}




