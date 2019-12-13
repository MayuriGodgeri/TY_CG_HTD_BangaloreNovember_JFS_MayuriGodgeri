package com.capgemini.phoneapplication.dao;

import com.capgemini.phoneapplication.bean.Contacts;

public interface OperationDAO {
	public boolean addContacts(Contacts bean);
	public boolean editContacts(int number);
	public boolean deleteContacts(String name);
}
