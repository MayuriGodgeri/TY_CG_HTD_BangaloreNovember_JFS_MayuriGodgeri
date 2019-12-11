package com.cpg.fms.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO
{

	private List<CustomerBean> customerbean =new ArrayList<CustomerBean>();
	@Override
	public List<CustomerBean> getAllUsers(CustomerBean bean) {

		return customerbean;
	}



	@Override
	public boolean addCustomer(CustomerBean bean) {
		for (CustomerBean c1 : customerbean) 
		{
			if(c1.getCustId()==bean.getCustId()) {
				return false;
			}
		}
		customerbean.add(bean);

		return true;
	}

	@Override
	public boolean modifyCustomer(int custId) {
		for (CustomerBean c2 : customerbean)
		{
			if(c2.getCustId()==custId)
			{
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deleteCustomer(int custId) {
		CustomerBean bean=null;
		for (CustomerBean c3 : customerbean) {
			bean=c3;
		}
		if(bean!=null) {
			customerbean.remove(bean);
			return true;
		}
		return false;
	}

}
