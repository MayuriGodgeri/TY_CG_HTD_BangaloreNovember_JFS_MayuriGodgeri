package com.capgemini.phoneapplication.service;

import com.capgemini.phoneapplication.bean.Contacts;

public interface OperationService {
	public boolean addContacts(Contacts bean);
	public boolean editContacts(int number);
	public boolean deleteContacts(String name);
}
