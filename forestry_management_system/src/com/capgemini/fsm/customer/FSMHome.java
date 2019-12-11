package com.capgemini.fsm.customer;

import java.util.Scanner;

public class FSMHome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for contractor");
		System.out.println("enter 2 for customer");
		System.out.println("enter 3 for product");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Contractor.main(null);
			break;
		case 2:
			Customer.main(null);
			break;
		case 3:
			Product.main(null);
			break;
		default:
			break;
		}
	}
}
