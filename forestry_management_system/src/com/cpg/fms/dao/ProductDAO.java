package com.cpg.fms.dao;

import java.util.List;

import com.capgemini.fms.bean.ProductBean;

public interface ProductDAO {
	public List<ProductBean> getAllProduct(ProductBean bean);
	boolean addProduct(ProductBean prod);
	boolean modifyProduct(int prodId);
	boolean deleteproduct(int prodId);
}
