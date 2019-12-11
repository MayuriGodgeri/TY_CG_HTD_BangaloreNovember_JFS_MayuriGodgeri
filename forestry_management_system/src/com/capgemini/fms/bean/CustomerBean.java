package com.capgemini.fms.bean;

import java.io.Serializable;

public class CustomerBean implements Serializable 
{
	private int custId;
	private String custName;
	private String streetAdd1;
	private String streetAdd2;
	private String town;
	private int postalCode;
	private String email;
	private long phoneNum;

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getStreetAdd1() {
		return streetAdd1;
	}
	public void setStreetAdd1(String streetAdd1) {
		this.streetAdd1 = streetAdd1;
	}
	public String getStreetAdd2() {
		return streetAdd2;
	}
	public void setStreetAdd2(String streetAdd2) {
		this.streetAdd2 = streetAdd2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", custName=" + custName + ", streetAdd1=" + streetAdd1 + ", streetAdd2="
				+ streetAdd2 + ", town=" + town + ", postalCode=" + postalCode + ", email=" + email + ", phoneNum="
				+ phoneNum + "]";
	}




}
