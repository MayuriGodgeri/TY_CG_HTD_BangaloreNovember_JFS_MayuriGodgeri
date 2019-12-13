package com.capgemini.phoneapplication.service;

import java.util.List;

import com.capgemini.phoneapplication.bean.Contacts;
import com.capgemini.phoneapplication.contactfactory.ContactFactory;
import com.capgemini.phoneapplication.dao.PhoneAppDAO;

public class PhoneAppServiceImpl implements PhoneAppService {
	PhoneAppDAO dao=ContactFactory.instanceOfPhoneAppDAOImpl();
	@Override
	public List<Contacts> getAllContact(Contacts bean) {
		// TODO Auto-generated method stub
		return dao.getAllContact(bean);
	}

	@Override
	public boolean searchContacts(String name) {
		// TODO Auto-generated method stub
		return dao.searchContacts(name);
	}

}
