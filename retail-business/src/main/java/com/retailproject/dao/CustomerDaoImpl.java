package com.retailproject.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
	public List<CustomerInfo> logincheckcustomer(CustomerInfo customerInfo) {
		Session session = sessionFactory.getCurrentSession();
		Query theQuery = session.createQuery("FROM CustomerInfo e WHERE e.user_email =:user_email and e.psword1=:psword1");
		theQuery.setParameter("user_email", customerInfo.getUser_email());
		theQuery.setParameter("psword1", customerInfo.getPsword1());
		@SuppressWarnings("unchecked")
		List<CustomerInfo> list =theQuery.getResultList();
		/*
		 * CustomerInfo c = list.get(0); System.out.println(c.getFname());
		 * if(list.isEmpty()) { System.out.println("The list is empty"); return list; }
		 * else { System.out.println("The list is not empty"); return list; }
		 */
		return list;	
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<RetailerInfo> getallRetailer() {
		Session session = sessionFactory.getCurrentSession();
		
		
		  Query<RetailerInfo> theQuery =
		  session.createQuery("from RetailerInfo",RetailerInfo.class);
		 
		/*
		 * Query<RetailerInfo> theQuery = session.
		 * createQuery("select re.retailerId,re.fname,re.lname,re.user_email,re.vatNo,re.address,re.phoneNo from RetailerInfo re"
		 * );
		 */
		
		//execute query and get result list
		List<RetailerInfo> retailerInfo = theQuery.getResultList();
		//List<RetailerInfo> retailerInfo = theQuery.getResultList();
        System.out.println(retailerInfo.get(0).getFname());
        System.out.println(retailerInfo.get(0).getPhoneNo());
        System.out.println(retailerInfo.get(0).getAddress());
		return retailerInfo;
	}
	
	
}
