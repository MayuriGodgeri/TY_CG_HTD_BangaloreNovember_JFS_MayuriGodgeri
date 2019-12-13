package com.capgemini.phoneapplication.controler;

import java.util.Scanner;

import com.capgemini.phoneapplication.bean.Contacts;
import com.capgemini.phoneapplication.contactfactory.ContactFactory;
import com.capgemini.phoneapplication.dao.OperationDAO;
import com.capgemini.phoneapplication.dao.PhoneAppDAO;
import com.capgemini.phoneapplication.service.OperationService;

public class Operate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Contacts bean=new Contacts();
		PhoneAppDAO dao= ContactFactory.instanceOfPhoneAppDAOImpl();
        OperationDAO dao1=ContactFactory.instanceOperationDAOImpl();
        OperationService services=ContactFactory.instanceOfOperationServices();
        while(true){
			System.out.println("Press 1 to delete");
			System.out.println("Press 2 to insert");
			System.out.println("Press 3 to edit");

			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the contact name");
				String name=sc.next();
				if(services.deleteContacts(bean.getName())) {
					System.out.println("contact deleted successfully");
				}
				else {
					System.err.println("contact not found");
				}
				break;
			case 2:
				System.out.println("enter the contact name");
				String name1=sc.next();
				System.out.println("enter the contact number");
				int num=sc.nextInt();
				System.out.println("enter the contact group");
				String grp=sc.next();
				if(services.addContacts(bean)) {
					System.out.println("contact added successfully");
				}
				else {
					System.err.println("contact not added");
				}
				break;
			case 3:
				System.out.println("enter the contact number");
				int numb=sc.nextInt();
				if(services.editContacts(numb)) {
					System.out.println("contact edited successfully");
				}
				else {
					System.err.println("contact not found");
				}
				break;
			}
		}
	}
}

