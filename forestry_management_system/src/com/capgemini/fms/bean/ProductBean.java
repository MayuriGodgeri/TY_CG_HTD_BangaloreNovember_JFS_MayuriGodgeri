package com.capgemini.fms.bean;

public class ProductBean {
	private int productId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + "]";
	}

}
