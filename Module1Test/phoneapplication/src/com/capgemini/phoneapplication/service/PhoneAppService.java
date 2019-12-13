package com.capgemini.phoneapplication.service;

import java.util.List;

import com.capgemini.phoneapplication.bean.Contacts;

public interface PhoneAppService {
	public List<Contacts> getAllContact(Contacts bean);
	public boolean searchContacts(String name);
}
