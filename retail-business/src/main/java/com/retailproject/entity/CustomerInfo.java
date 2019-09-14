package com.retailproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "customerinfo")
public class CustomerInfo {
	
	@Id
	@GenericGenerator(name = "customerId",strategy = "increment")
	private int customerId;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "user_email")
	private String user_email;
	
	@Column(name = "panNo")
	private String panNo;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phoneNo")
	private String phoneNo;
	
	@Column(name = "psword1")
	private String psword1;
	
	@Column(name = "psword2")
	private String psword2;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public CustomerInfo() {}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPsword1() {
		return psword1;
	}

	public void setPsword1(String psword1) {
		this.psword1 = psword1;
	}
	
	
	public String getPsword2() {
		return psword2;
	}
	public void setPsword2(String psword2) {
		this.psword2 = psword2;
	}
	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", fname=" + fname + ", lname=" + lname + ", user_email="
				+ user_email + ", panNo=" + panNo + ", address=" + address + ", phoneNo=" + phoneNo + ", psword1="
				+ psword1 + "]";
	}
	
}
