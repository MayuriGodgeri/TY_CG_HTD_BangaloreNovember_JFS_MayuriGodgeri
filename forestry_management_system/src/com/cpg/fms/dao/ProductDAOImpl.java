package com.cpg.fms.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.CustomerBean;
import com.capgemini.fms.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {

	private List<ProductBean> productbean =new ArrayList<ProductBean>();
	@Override
	public List<ProductBean> getAllProduct(ProductBean bean) {
		return productbean;
	}

	@Override
	public boolean addProduct(ProductBean prod) {
		for (ProductBean c1 : productbean) 
		{
			if(c1.getProductId()==prod.getProductId()) {
				return false;
			}
		}
		productbean.add(prod);
		return true;
	}

	@Override
	public boolean modifyProduct(int prodId) {
		for (ProductBean c2 : productbean)
		{
			if(c2.getProductId()==prodId)
			{
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deleteproduct(int prodId) {
		ProductBean bean=null;
		for (ProductBean c3 : productbean) {
			bean=c3;
		}
		if(bean!=null) {
			productbean.remove(bean);
			return true;
		}
		return false;
	}

}
