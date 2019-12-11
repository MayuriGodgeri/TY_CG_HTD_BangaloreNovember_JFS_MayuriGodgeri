package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.bean.UserBean;

public class UserDAOImpl implements UserDAO
{
	FileReader reader;
	Properties prop;
	UserBean user;
   
	public UserDAOImpl() 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public List<UserBean> getAllUsers() {
		List<UserBean> list=new ArrayList<UserBean>();
		try( Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next())
			{
			    user=new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setEmail(rs.getString(3));
				list.add(user);
				
				}
			return list;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserBean userLogin(String userid, String password) {
		try( Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("loginQuery"))){
				pstmt.setInt(1,user.getUserid());
				pstmt.setString(2,user.getPassword());
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					user=new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUserName(rs.getString(2));
					user.setEmail(rs.getString(3));
				}
				return user;
		}
		 catch (Exception e) {
				
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public boolean updateUser(int userid, String password, String email) {
		try( Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("updateQuery"))){
				pstmt.setInt(1,user.getUserid());
				pstmt.setString(2,user.getPassword());
				pstmt.setString(3,user.getEmail());
				int count=pstmt.executeUpdate();
				if(count>0) {
					return true;
				}}
		 catch (Exception e) {
				
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		try( Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteQuery"))){
				pstmt.setInt(1,user.getUserid());
				pstmt.setString(2,user.getPassword());
				int count=pstmt.executeUpdate();
				if(count>0) {
					return true;
				}}
		 catch (Exception e) {
				
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean insertUser(UserBean user) {
		try( Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertQuery"));){
				pstmt.setInt(1,user.getUserid());
				pstmt.setString(2,user.getUserName());
				pstmt.setString(3,user.getEmail());
				pstmt.setString(4,user.getPassword());
				int count=pstmt.executeUpdate();
				if(count>0) {
					return true;
				
				}
		}
		 catch (Exception e) {
				
				e.printStackTrace();
			}
				
		return false;
	}
	

}