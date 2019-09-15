package com.retailproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.retailproject.entity.CustomerInfo;
import com.retailproject.entity.RetailerInfo;
import com.retailproject.service.CustomerService;



@Controller
@RequestMapping("/customerController")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	//controller for registration jsp
	@GetMapping("/cr-page")
	public String customerRegistrationPage(Model theModel) {
		CustomerInfo customerInfo = new CustomerInfo();
		theModel.addAttribute(customerInfo);
		return "customer-registration";
	}
	
	@GetMapping("/re-page")
	public String retailerRegistrationPage(Model theModel) {
		RetailerInfo retailerInfo = new RetailerInfo();
		theModel.addAttribute(retailerInfo);
		return "retailer-registration";
	}
	
	@PostMapping("/customer-registration")
	public String registrationConfirmation(@ModelAttribute ("customerInfo") CustomerInfo customerInfo) {
		System.out.println(customerInfo.getFname() +" "+ customerInfo.getLname()+" "+ customerInfo.getPanNo()+ " "+customerInfo.getAddress()+ " "+customerInfo.getPhoneNo()+" "+customerInfo.getPsword1()+customerInfo.getUser_email());
		customerService.registerCustomer(customerInfo);
		
		return "login-form";
	}
	
	@PostMapping("/retailer-registration")
	public String registrationConfirmation(@ModelAttribute ("retailerInfo") RetailerInfo retailerInfo) {
		customerService.registerRetailer(retailerInfo);
		
		return "login-form";
	}
	
	@GetMapping("/login-form")
	public String loginform(Model theModel) {
		
	}
	
}
