package com.retailproject.service;

import java.util.List;

import com.retailproject.entity.RetailerInfo;

public interface RetailerService {
	public void registerRetailer(RetailerInfo retailerInfo);
	
	public List<RetailerInfo> logincheckretaile(RetailerInfo retailerInfo);
}
