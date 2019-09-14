package com.retailproject.service;

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
	public void registerRetailer(RetailerInfo retailerInfo) {
		customerDao.registerRetailer(retailerInfo);
		
	}

}
