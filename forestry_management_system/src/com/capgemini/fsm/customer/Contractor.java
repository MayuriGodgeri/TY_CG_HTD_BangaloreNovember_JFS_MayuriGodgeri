package com.capgemini.fsm.customer;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms.bean.ContractorBean;
import com.capgemini.fms.bean.CustomerBean;
import com.capgemini.fsm.factory.ContractorFactory;
import com.cpg.fms.dao.ContractorDAO;



public class Contractor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ContractorBean bean=new ContractorBean();
		ContractorDAO dao= ContractorFactory.getContractorDAO();

		while(true) {
			System.out.println("press 1 to insert contractor details");
			System.out.println("press 2 to delete customer details");
			System.out.println("press 3 to get all details");
			System.out.println("press 4 for home");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter contractor number");
				int id=sc.nextInt();
				System.out.println("enter customer id");
				int cid=sc.nextInt();
				System.out.println("enter product id");
				int pid=sc.nextInt();
				System.out.println("enter haulier id");
				int hid=sc.nextInt();
				System.out.println("enter delivery date");
				String date=sc.next();
				System.out.println("enter delivery day ");
				String day=sc.next();
				bean.setContractNo(id);
				bean.setCustomerId(cid);
				bean.setProductId(pid);
				bean.setHaulierId(hid);
				bean.setDeliveryDate(date);
				bean.setDeliveryDay(day);
				boolean check=dao.addContractor(bean);
				if(check) {
					System.out.println("contractor added successfully");
				}
				else {
					System.err.println("contractor not added");
				}

				break;
			case 2:
				System.out.println("enter contractor number to be deleted");
				int id1=sc.nextInt();
				boolean check1=dao.deleteContractor(id1);

				if(check1) {
					System.out.println("contractor deleted successfully");
				}
				else {
					System.err.println("contractor not found");
				}
				break;
			case 3:
				List<ContractorBean> c1=dao.getAllContract( bean);
				if(c1 != null) {
					for (ContractorBean cust : c1) {
						System.out.println(cust);
					}
				}
				else {
					System.err.println("contractor not found");
				}
				break;
			case 4:
				FSMHome.main(null);
				break;
			default:
				break;

			}
		}
	}
}