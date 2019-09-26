package com.retailproject.dao;

import java.util.List;

import com.retailproject.entity.CustomerInfo;
import com.retailproject.entity.RetailerInfo;

public interface CustomerDao {
	public void registerCustomer(CustomerInfo customerInfo);
	
		
	public List<CustomerInfo> logincheckcustomer(CustomerInfo customerInfo);
	
	
	
	public List<RetailerInfo> getallRetailer();
}
