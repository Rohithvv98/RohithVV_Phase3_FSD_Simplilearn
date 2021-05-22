package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	public AdminService aservice;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	//@ResponseBody
	public String AdminloginPage()
	{
		return "adminlogin";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	//@ResponseBody
	public String AdminloginValid(@RequestParam("aname")String name,@RequestParam("apass")String pass)
	{
		//System.out.println("name"+name+"pass"+pass);
		
		if(aservice.AdminLogin(name, pass)) 
		{
			return "adminpanel";
		}
		return "adminlogin";
	}
	
	@RequestMapping(value="/updatepass",method=RequestMethod.GET)
	//@ResponseBody
	public String Adminpass()
	{
		return "updatepass";
	}
	
	@RequestMapping(value="/updatepass",method=RequestMethod.POST)
	public String UpdatePassword(@RequestParam("aname")String name,@RequestParam("apass")String pass,@RequestParam("npass")String newpass)
	{
		if(aservice.AdminLogin(name, pass)) 
		{
			aservice.UpdatePass(name,pass,newpass);
			return "adminpanel";
		}
		return "updatepass";
	}
}
