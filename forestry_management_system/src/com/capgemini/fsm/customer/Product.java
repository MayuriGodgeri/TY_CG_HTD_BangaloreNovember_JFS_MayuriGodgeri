package com.capgemini.fsm.customer;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fms.bean.CustomerBean;
import com.capgemini.fms.bean.ProductBean;
import com.capgemini.fsm.factory.ProductFactory;
import com.cpg.fms.dao.ProductDAO;


public class Product {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductBean bean=new ProductBean();
		ProductDAO dao= ProductFactory.getProductDAO();

		while(true) {
			System.out.println("press 1 to insert product details");
			System.out.println("press 2 to modify product details");
			System.out.println("press 3 to delete product details");
			System.out.println("press 4 to get all product details");
			System.out.println("press 5 for home");
			int choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.println("enter product id");
				int id=sc.nextInt();
				bean.setProductId(id);
				boolean check=dao.addProduct(bean);
				if(check) {
					System.out.println("product added successfully");
				}
				else {
					System.err.println("product not added");
				}
				break;
			case 2:
				System.out.println("enter product id");
				int id1=sc.nextInt();
				bean.setProductId(id1);
				boolean check1=dao.modifyProduct(id1);
				if(check1) {
					System.out.println("product modified successfully");
				}
				else {
					System.err.println("product not added");
				}
				break;
			case 3:
				System.out.println("enter product id");
				int id2=sc.nextInt();
				bean.setProductId(id2);
				boolean check2=dao.deleteproduct(id2);
				if(check2) {
					System.out.println("product deleted successfully");
				}
				else {
					System.err.println("product not added");
				}
				break;
			case 4:
				List<ProductBean> c1=dao.getAllProduct( bean);
				if(c1 != null) {
					for (ProductBean prod : c1) {
						System.out.println(prod);
					}
				}
				else {
					System.err.println("product not found");
				}
				break;
			case 5:
				FSMHome.main(null);
				break;
			default:
				break;

			}
		}
	}}
