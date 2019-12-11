package com.capgemini.fsm.factory;

import com.cpg.fms.dao.ProductDAO;
import com.cpg.fms.dao.ProductDAOImpl;

public class ProductFactory {
	public static ProductDAO getProductDAO() {
		return new ProductDAOImpl();
	}
}
