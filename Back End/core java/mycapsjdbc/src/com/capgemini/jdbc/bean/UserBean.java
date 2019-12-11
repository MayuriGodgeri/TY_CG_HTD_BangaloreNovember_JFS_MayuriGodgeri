package com.capgemini.jdbc.bean;

import java.io.Serializable;
//@Data
public class UserBean implements Serializable
{
private int userid;
private String userName;
private String email;
private String password;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "UserBean [userid=" + userid + ", userName=" + userName + ", email=" + email + "]";
}


}
