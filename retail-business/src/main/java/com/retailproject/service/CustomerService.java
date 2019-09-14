package com.retailproject.service;

import com.retailproject.entity.CustomerInfo;
import com.retailproject.entity.RetailerInfo;

public interface CustomerService {
	
	public void registerCustomer(CustomerInfo customerInfo);
	public void registerRetailer(RetailerInfo retailerInfo);
		
}
