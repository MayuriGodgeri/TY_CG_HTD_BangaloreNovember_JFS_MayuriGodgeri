package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UserLogin 
{
	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServices();
		UserBean user=new UserBean();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter username..");
		user.setUserName(sc.nextLine());
		System.out.println("enter password");
		user.setPassword(sc.nextLine());
		
		UserBean user1=services.userLogin(user.getUserName(),user.getPassword());
		if(user1!=null) {
			System.out.println("userid is "+user1.getUserid());
			System.out.println("username is "+user1.getUserName());
			System.out.println("email is "+user1.getEmail());
		}
		else {
			System.err.println("enter correct details");
		}
}
}
