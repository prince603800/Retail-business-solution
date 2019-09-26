package com.retailproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.retailproject.entity.RetailerInfo;

@Repository
public class RetailerDaoImpl implements RetailerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void registerRetailer(RetailerInfo retailerInfo) {
		Session session = sessionFactory.getCurrentSession();
		session.save(retailerInfo);
		
	}

	@Override
	public List<RetailerInfo> logincheckretailer(RetailerInfo retailerInfo) {
		Session session = sessionFactory.getCurrentSession();
		Query theQuery = session.createQuery("FROM RetailerInfo e WHERE e.user_email =:user_email and e.psword1=:psword1");
		theQuery.setParameter("user_email", retailerInfo.getUser_email());
		theQuery.setParameter("psword1", retailerInfo.getPsword1());
		@SuppressWarnings("unchecked")
		List<RetailerInfo> list =theQuery.getResultList();
		return list;
		/*
		 * if(list.isEmpty()) { System.out.println("The list is empty"); return false; }
		 * else { System.out.println("The list is not empty"); return true; }
		 */
	}

}
