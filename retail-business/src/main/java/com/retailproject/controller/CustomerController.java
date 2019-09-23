package com.retailproject.controller;

import java.util.List;

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
		
		return "redirect:/customerController/login-form";
	}
	
	@PostMapping("/retailer-registration")
	public String registrationConfirmation(@ModelAttribute ("retailerInfo") RetailerInfo retailerInfo) {
		customerService.registerRetailer(retailerInfo);
		
		return "redirect:/customerController/login-form";
	}
	
	@GetMapping("/login-form")
	public String loginform(Model theModel) {
		CustomerInfo customerInfo = new CustomerInfo();
		RetailerInfo retailerInfo = new RetailerInfo();
		theModel.addAttribute("customerInfo", customerInfo);
		theModel.addAttribute("retailerInfo",retailerInfo);
		return "login-form";
	}
	
	@PostMapping("/cu-login")
	public String clogin(@ModelAttribute ("customerInfo") CustomerInfo customerInfo,Model theModel) {
		
		
		List<CustomerInfo> list = customerService.logincheckcustomer(customerInfo);
		CustomerInfo customer = list.get(0);
		System.out.println(customer.getFname());
		
		if(!list.isEmpty()) {
			List<RetailerInfo> retailersInfo = customerService.getallRetailer();
	        System.out.println(retailersInfo.isEmpty());
	        	        
			theModel.addAttribute("retailersInfo", retailersInfo);
			theModel.addAttribute("validcustomer", customer);
			
			return "customer-dashboard";
		}
		
		else {
			return "redirect:/customerController/login-form";
	}
	
	}
	
	@PostMapping("/re-login")
	public String rlogin(@ModelAttribute ("retailerInfo") RetailerInfo retailerInfo) {
		System.out.println(retailerInfo.getUser_email());
		System.out.println(retailerInfo.getPsword1());
		
		boolean user_exists= customerService.logincheckretaile(retailerInfo);
		
		if(user_exists==true) {
			return "retailer-dashboard";
		}
		
		else {
			return "login-form";
	}
	}
	
}
