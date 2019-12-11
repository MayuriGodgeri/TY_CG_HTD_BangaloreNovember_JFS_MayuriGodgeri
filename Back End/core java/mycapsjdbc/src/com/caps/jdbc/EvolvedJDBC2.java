package com.caps.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBC2 {
	public static void main(String[] args) {
		Properties prop=null;
		FileReader reader=null;
		try {

			reader=new FileReader("db.properties");   //--->filenotfound excep
			prop=new Properties();
			prop.load(reader); //----->io exception

			Class.forName(prop.getProperty("driverClass"));
			System.out.println("driver loaded......");


		} catch (Exception e) {

			e.printStackTrace();
		}

		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
			while(rs.next()) {

				System.out.println("userid: "+rs.getInt("userid"));
				System.out.println("username: "+rs.getString("username"));
				System.out.println("email: "+rs.getString("email"));
				System.out.println("password: "+rs.getString("password"));
				System.out.println("---------------------");
			}

		}
		catch (Exception e) {

			e.printStackTrace();
		}
	}
}
