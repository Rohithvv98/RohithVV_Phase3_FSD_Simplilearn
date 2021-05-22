package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	String userName;
	String password;
	String email;
	String customerName;
	String customerAddr;
	
	
	
	public User() {
		super();
	}
	public User(String userName, String password, String email, String customerName,
			String customerAddr) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.customerName = customerName;
		this.customerAddr = customerAddr;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddr() {
		return customerAddr;
	}
	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", email=" + email
				+ ", customerName=" + customerName + ", customerAddr=" + customerAddr + "]";
	}
	
	
}
