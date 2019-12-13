package com.capgemini.phoneapplication.contactfactory;

import com.capgemini.phoneapplication.dao.OperationDAO;
import com.capgemini.phoneapplication.dao.OperationDAOImpl;
import com.capgemini.phoneapplication.dao.PhoneAppDAO;
import com.capgemini.phoneapplication.dao.PhoneAppDAOImpl;
import com.capgemini.phoneapplication.service.OperationService;
import com.capgemini.phoneapplication.service.OperationServiceImpl;
import com.capgemini.phoneapplication.service.PhoneAppService;
import com.capgemini.phoneapplication.service.PhoneAppServiceImpl;

public class ContactFactory {
	public static PhoneAppDAO instanceOfPhoneAppDAOImpl() {
		PhoneAppDAO dao =new PhoneAppDAOImpl();
		return dao;
}
	public static OperationDAO instanceOperationDAOImpl() {
		OperationDAO dao1 =new OperationDAOImpl();
		return dao1;
}
	public static PhoneAppService instanceOfPhoneAppServices() {
		PhoneAppService services=new PhoneAppServiceImpl();
		return services;
	}
	public static OperationService instanceOfOperationServices() {
		OperationService service1=new OperationServiceImpl();
		return service1;
	}
}
