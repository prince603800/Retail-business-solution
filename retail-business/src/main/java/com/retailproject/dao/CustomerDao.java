package com.retailproject.dao;

import com.retailproject.entity.CustomerInfo;
import com.retailproject.entity.RetailerInfo;

public interface CustomerDao {
	public void registerCustomer(CustomerInfo customerInfo);
	public void registerRetailer(RetailerInfo retailerInfo);
	public boolean logincheckcustomer(CustomerInfo customerInfo);
	public boolean logincheckretailer(RetailerInfo retailerInfo);
}
