package com.cpg.fms.dao;

import java.util.List;

import com.capgemini.fms.bean.ContractorBean;
public interface ContractorDAO {
	public List<ContractorBean> getAllContract(ContractorBean bean);
	boolean addContractor(ContractorBean bean);
	boolean deleteContractor(int contrId);

}
