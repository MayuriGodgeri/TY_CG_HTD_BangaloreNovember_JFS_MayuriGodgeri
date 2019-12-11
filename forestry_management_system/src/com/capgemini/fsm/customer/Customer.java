package com.capgemini.fsm.customer;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms.bean.CustomerBean;
import com.capgemini.fsm.factory.CustomerFactory;
import com.cpg.fms.dao.CustomerDAO;
import com.cpg.fms.dao.CustomerDAOImpl;

public class Customer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CustomerBean bean=new CustomerBean();
		CustomerDAO dao= CustomerFactory.getCustomerDAO();

		while(true) {
			System.out.println("press 1 to insert customer details");
			System.out.println("press 2 to modify customer details");
			System.out.println("press 3 to delete customer details");
			System.out.println("press 4 to get all details");
			System.out.println("press 5 for home");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the customer id");
				int id=sc.nextInt();
				System.out.println("enter customer name");
				String name=sc.next();
				System.out.println("enter customer Street Address1");
				String add1=sc.next();
				System.out.println("enter customer Street Address2");
				String add2=sc.next();
				System.out.println("enter customer town");
				String town=sc.next();
				System.out.println("enter customer postal code");
				int post=sc.nextInt();
				System.out.println("enter customer email");
				String email=sc.next();
				System.out.println("enter customer phone number");
				long phn=sc.nextLong();
				bean.setCustId(id);
				bean.setCustName(name);
				bean.setStreetAdd1(add1);
				bean.setStreetAdd2(add2);
				bean.setTown(town);
				bean.setPostalCode(post);
				bean.setEmail(email);
				bean.setPhoneNum(phn);
				boolean check=dao.addCustomer(bean);
				if(check) {
					System.out.println("customer added successfully");
				}
				else {
					System.err.println("customer not added");
				}
				break;
			case 2:
				System.out.println("enter the customer id to be modified");
				int id2=sc.nextInt();
				if(bean.getCustId()==id2)
				{
					System.out.println("enter customer name");
					String mname=sc.next();
					System.out.println("enter customer Street Address1");
					String madd1=sc.next();
					System.out.println("enter customer Street Address2");
					String madd2=sc.next();
					System.out.println("enter customer town");
					String mtown=sc.next();
					System.out.println("enter customer postal code");
					int mpost=sc.nextInt();
					System.out.println("enter customer email");
					String memail=sc.next();
					System.out.println("enter customer phone number");
					long mphn=sc.nextLong();
					bean.setCustId(id2);
					bean.setCustName(mname);
					bean.setStreetAdd1(madd1);
					bean.setStreetAdd2(madd2);
					bean.setTown(mtown);
					bean.setPostalCode(mpost);
					bean.setEmail(memail);
					bean.setPhoneNum(mphn);
				}
				boolean check3=dao.modifyCustomer(id2);
				if(check3) {
					System.out.println("customer modified successfully");
				}
				else {
					System.err.println("customer not found");
				}

				break;
			case 3:
				System.out.println("enter id to be deleted");
				int id1=sc.nextInt();

				boolean check1=dao.deleteCustomer(id1);

				if(check1) {
					System.out.println("customer deleted successfully");
				}
				else {
					System.err.println("customer not found");
				}
				break;
			case 4:
				List<CustomerBean> c1=dao.getAllUsers( bean);
				if(c1 != null) {
					for (CustomerBean cust : c1) {
						System.out.println(cust);
					}
				}
				else {
					System.err.println("customer not found");
				}
				break;
			case 5:
				FSMHome.main(null);
				break;
			default:
				break;
			}

		}
	}
}
