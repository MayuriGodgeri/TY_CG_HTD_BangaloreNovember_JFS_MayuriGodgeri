package com.cpg.fms.dao;

import java.util.List;

import com.capgemini.fms.bean.CustomerBean;

public interface CustomerDAO 
{
	public List<CustomerBean> getAllUsers(CustomerBean bean);
	boolean addCustomer(CustomerBean cust);
	boolean modifyCustomer(int custId);
	boolean deleteCustomer(int custId);

}
