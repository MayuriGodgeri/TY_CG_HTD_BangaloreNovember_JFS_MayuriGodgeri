package com.capgemini.fsm.factory;

import com.cpg.fms.dao.CustomerDAO;
import com.cpg.fms.dao.CustomerDAOImpl;

public class CustomerFactory  
{
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl();
	}
}
