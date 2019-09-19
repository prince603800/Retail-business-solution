package com.retailproject.dao;

import java.util.List;

import javax.persistence.Query;

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

	@Override
	public boolean logincheckcustomer(CustomerInfo customerInfo) {
		Session session = sessionFactory.getCurrentSession();
		Query theQuery = session.createQuery("FROM CustomerInfo e WHERE e.user_email =:user_email and e.psword1=:psword1");
		theQuery.setParameter("user_email", customerInfo.getUser_email());
		theQuery.setParameter("psword1", customerInfo.getPsword1());
		@SuppressWarnings("unchecked")
		List<CustomerInfo> list =theQuery.getResultList();
		if(list.isEmpty()) {
			System.out.println("The list is empty");
			return false;
		}
		else {
			System.out.println("The list is not empty");
			return true;
		}
			
	}

	@Override
	public boolean logincheckretailer(RetailerInfo retailerInfo) {
		Session session = sessionFactory.getCurrentSession();
		Query theQuery = session.createQuery("FROM RetailerInfo e WHERE e.user_email =:user_email and e.psword1=:psword1");
		theQuery.setParameter("user_email", retailerInfo.getUser_email());
		theQuery.setParameter("psword1", retailerInfo.getPsword1());
		@SuppressWarnings("unchecked")
		List<RetailerInfo> list =theQuery.getResultList();
		if(list.isEmpty()) {
			System.out.println("The list is empty");
			return false;
		}
		else {
			System.out.println("The list is not empty");
			return true;
		}
	}
	
	
}
