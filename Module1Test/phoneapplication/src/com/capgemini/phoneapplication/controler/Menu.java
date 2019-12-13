package com.capgemini.phoneapplication.controler;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.capgemini.phoneapplication.bean.Contacts;
import com.capgemini.phoneapplication.contactfactory.ContactFactory;
import com.capgemini.phoneapplication.dao.PhoneAppDAO;

public class Menu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Contacts bean=new Contacts();
		PhoneAppDAO dao= ContactFactory.instanceOfPhoneAppDAOImpl();
        while(true) {
        System.out.println("Press 1 to show all contacts");
		System.out.println("Press 2 to search for contact");
		System.out.println("Press 3 to operate on contacts");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			List<Contacts> c1=dao.getAllContact( bean);
			if(c1 != null) {
				for ( Contacts cont : c1) {
					System.out.println(cont);
				}
			}
			else {
				System.err.println("contact not found");
			}
			break;
		case 2:
			System.out.println("enter the contact name");
			String name=sc.next();
           boolean check1=dao.searchContacts(name);

			if(check1) {
				System.out.println("contact found");
			}
			else {
				System.err.println("contact not found");
			}

			break;
		case 3:
			Operate.main(null);
		}
	}
}
}
