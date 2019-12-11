package com.cpg.fms.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.ContractorBean;

public class ContractorDAOImpl implements ContractorDAO {
	private List<ContractorBean> contractorbean =new ArrayList<ContractorBean>();


	@Override
	public boolean addContractor(ContractorBean bean) {
		for (ContractorBean c : contractorbean) {
			if(c.getContractNo()==bean.getContractNo()) {
				return false;
			}
		}
		contractorbean.add(bean);
		return true;
	}

	@Override
	public boolean deleteContractor(int contrNo) {
		ContractorBean bean=null;
		for (ContractorBean c2 : contractorbean) {
			if(c2.getContractNo()==contrNo) {
				bean=c2;

			}

			if(bean!=null) {
				contractorbean.remove(bean);
				return true;
			}

		}
		return false;
	}
	@Override
	public List<ContractorBean> getAllContract(ContractorBean bean) {

		return contractorbean;
	}

}
