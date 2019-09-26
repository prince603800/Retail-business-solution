package com.retailproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.retailproject.dao.CustomerDao;
import com.retailproject.entity.CustomerInfo;
import com.retailproject.entity.RetailerInfo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	@Transactional
	public void registerCustomer(CustomerInfo customerInfo) {
		customerDao.registerCustomer(customerInfo);
	}

	

	@Override
	@Transactional
	public List<CustomerInfo> logincheckcustomer(CustomerInfo customerInfo) {
		System.out.println("inside logincheck customer");
		List<CustomerInfo> list = customerDao.logincheckcustomer(customerInfo);
		
		return list;
	}

	

	@Override
	@Transactional
	public List<RetailerInfo> getallRetailer() {
		System.out.println("Inside retailer");
		List<RetailerInfo> retailerInfo= customerDao.getallRetailer();
		return retailerInfo;
	}

	

}
