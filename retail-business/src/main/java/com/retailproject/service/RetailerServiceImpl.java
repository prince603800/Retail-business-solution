package com.retailproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.retailproject.dao.RetailerDao;
import com.retailproject.entity.RetailerInfo;

@Service
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	RetailerDao retailerDao;
	
	@Override
	@Transactional
	public void registerRetailer(RetailerInfo retailerInfo) {
		System.out.println(retailerInfo.getFname());
		retailerDao.registerRetailer(retailerInfo);
		
	}

	@Override
	@Transactional
	public List<RetailerInfo> logincheckretaile(RetailerInfo retailerInfo) {
		List<RetailerInfo> list = retailerDao.logincheckretailer(retailerInfo);
		return list;
	}
}
