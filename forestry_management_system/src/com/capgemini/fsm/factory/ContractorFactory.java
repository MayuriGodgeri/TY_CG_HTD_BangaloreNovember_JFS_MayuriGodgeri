package com.capgemini.fsm.factory;

import com.cpg.fms.dao.ContractorDAO;
import com.cpg.fms.dao.ContractorDAOImpl;

public class ContractorFactory {
	public static ContractorDAO getContractorDAO() {
		return new ContractorDAOImpl();
	}
}
