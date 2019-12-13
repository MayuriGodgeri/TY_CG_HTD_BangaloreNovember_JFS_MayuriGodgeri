package com.capgemini.phoneapplication.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.phoneapplication.bean.Contacts;

public class PhoneAppDAOImpl implements PhoneAppDAO {

	FileReader reader;
	Properties prop;
	Contacts user;

	public PhoneAppDAOImpl() 
	{
		try {
			Class.forName("driverClass");
			reader=new FileReader("db.property");
			prop=new Properties();
			prop.load(reader);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public List<Contacts> getAllContact(Contacts bean) {
		List<Contacts> list=new ArrayList<Contacts>();
		try( Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				user.setName(rs.getString(1));
				user.setNumber(rs.getInt(2));
				user.setGroup(rs.getString(1));
				list.add(user);

			}
			return list;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

    @Override
	public boolean searchContacts(String name) {
    	try( Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("querySearch"))){
    		while(rs.next()) {
				user.setName(rs.getString(1));
				user.setNumber(rs.getInt(2));
				user.setGroup(rs.getString(1));
			}
    	}catch (Exception e) {

			e.printStackTrace();
		}
		return false;
	}




}
