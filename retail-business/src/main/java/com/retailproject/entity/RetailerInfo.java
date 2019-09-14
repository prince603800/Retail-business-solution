package com.retailproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "retailerinfo")
public class RetailerInfo {
	
	@Id
	@GenericGenerator(name = "retailerId",strategy = "increment")
	private int retailerId;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "user_email")
	private String user_email;
	
	@Column(name = "vatNo")
	private String vatNo;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phoneNo")
	private String phoneNo;
	
	@Column(name = "psword1")
	private String psword1;
	
	@Column(name = "psword2")
	private String psword2;

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
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

	public String getVatNo() {
		return vatNo;
	}

	public void setVatNo(String vatNo) {
		this.vatNo = vatNo;
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
		return "RetailerInfo [retailerId=" + retailerId + ", fname=" + fname + ", lname=" + lname + ", user_email="
				+ user_email + ", vatNo=" + vatNo + ", address=" + address + ", phoneNo=" + phoneNo + ", psword1="
				+ psword1 + ", psword2=" + psword2 + "]";
	}
	
	
}
