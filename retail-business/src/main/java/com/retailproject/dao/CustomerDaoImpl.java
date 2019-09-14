package com.retailproject.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.retailproject.entity.CustomerInfo;
import com.retailproject.entity.RetailerInfo;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	SessionFactory sessionFactory; 
	
	@Override
	public void registerCustomer(CustomerInfo customerInfo) {
		Session session = sessionFactory.getCurrentSession();
		session.save(customerInfo);
	}

	@Override
	public void registerRetailer(RetailerInfo retailerInfo) {
		Session session = sessionFactory.getCurrentSession();
		session.save(retailerInfo);
		
	}
	
	
}
