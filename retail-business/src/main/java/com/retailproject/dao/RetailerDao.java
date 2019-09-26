package com.retailproject.dao;

import java.util.List;

import com.retailproject.entity.RetailerInfo;

public interface RetailerDao {
	public void registerRetailer(RetailerInfo retailerInfo);
	
	public List<RetailerInfo> logincheckretailer(RetailerInfo retailerInfo);
}
