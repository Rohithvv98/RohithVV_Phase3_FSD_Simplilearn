package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mainapp")
public class MainApp {
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	//@ResponseBody
	public String homepage()
	{
		return "welcome";
	}
	
	@RequestMapping(value="/aboutus",method=RequestMethod.GET)
	//@ResponseBody
	public String aboutus()
	{
		return "aboutus";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	//@ResponseBody
	public String logout()
	{
		return "logout";
	}
}
