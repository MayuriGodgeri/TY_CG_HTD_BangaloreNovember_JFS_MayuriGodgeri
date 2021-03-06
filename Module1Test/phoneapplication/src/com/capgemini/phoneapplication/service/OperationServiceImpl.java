package com.capgemini.phoneapplication.service;

import com.capgemini.phoneapplication.bean.Contacts;
import com.capgemini.phoneapplication.contactfactory.ContactFactory;
import com.capgemini.phoneapplication.dao.OperationDAO;

public class OperationServiceImpl implements OperationService{
	OperationDAO dao=ContactFactory.instanceOperationDAOImpl();
	@Override
	public boolean addContacts(Contacts bean) {
		// TODO Auto-generated method stub
		return dao.addContacts(bean);
	}

	@Override
	public boolean editContacts(int number) {
		// TODO Auto-generated method stub
		return dao.editContacts(number);
	}

	@Override
	public boolean deleteContacts(String name) {
		// TODO Auto-generated method stub
		return dao.deleteContacts(name);
	}

}
