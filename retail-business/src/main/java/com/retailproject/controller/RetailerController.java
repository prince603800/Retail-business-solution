package com.retailproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.retailproject.entity.RetailerInfo;
import com.retailproject.service.RetailerService;

@Controller
@RequestMapping("/retailerController")
public class RetailerController {
	
	@Autowired
	RetailerService retailerService;
	
	@GetMapping("/re-page")
	public String retailerRegistrationPage(Model theModel) {
		RetailerInfo retailerInfo = new RetailerInfo();
		theModel.addAttribute(retailerInfo);
		return "retailer-registration";
	}

	
	
	
	@PostMapping("/retailer-registration")
	public String registrationConfirmation(@ModelAttribute ("retailerInfo") RetailerInfo retailerInfo) {
		System.out.println(retailerInfo.getFname());
		retailerService.registerRetailer(retailerInfo);
		
		return "redirect:/customerController/login-form";
	}
	
	
	
	
	@PostMapping("/re-login")
	public String rlogin(@ModelAttribute ("retailerInfo") RetailerInfo retailerInfo) {
		System.out.println(retailerInfo.getUser_email());
		System.out.println(retailerInfo.getPsword1());
		
		List<RetailerInfo> list = retailerService.logincheckretaile(retailerInfo);
		
		if(!list.isEmpty()) {
					
			return "retailer-dashboard";
		}
		
		else {
			return "redirect:/customerController/login-form";
	}
	}
}
