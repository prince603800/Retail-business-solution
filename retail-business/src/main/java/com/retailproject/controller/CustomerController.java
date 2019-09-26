package com.retailproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	
	@PostMapping("/customer-registration")
	public String registrationConfirmation(@ModelAttribute ("customerInfo") CustomerInfo customerInfo) {
		System.out.println(customerInfo.getFname() +" "+ customerInfo.getLname()+" "+ customerInfo.getPanNo()+ " "+customerInfo.getAddress()+ " "+customerInfo.getPhoneNo()+" "+customerInfo.getPsword1()+customerInfo.getUser_email());
		customerService.registerCustomer(customerInfo);
		
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
		
		
		if(!list.isEmpty()) {
			List<RetailerInfo> retailersInfo = customerService.getallRetailer();
	        System.out.println(retailersInfo.isEmpty());
	        	        
			theModel.addAttribute("retailersInfo", retailersInfo);
			theModel.addAttribute("validcustomer", list.get(0));
			
			return "customer-dashboard";
		}
		
		else {
			return "redirect:/customerController/login-form";
	}
	
	}
	
	
	
	@GetMapping("/customerdashboard-retailerdetail")
	public String customerdashboardRetailerDetail(@RequestParam("retailerId") int retailerId,@RequestParam("customerId") int  customerId) {
		
		System.out.println(retailerId);
		System.out.println(customerId);
		
		return "customerdashboard-retailerdetail";
	}
	
	
}
