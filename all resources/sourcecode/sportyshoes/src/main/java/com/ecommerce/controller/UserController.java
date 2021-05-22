package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ecommerce.model.User;
import com.ecommerce.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService uservice;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	//@ResponseBody
	public String UserloginPage()
	{
		return "userlogin";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	//@ResponseBody
	public String UserloginValid(@RequestParam("uname")String name,@RequestParam("upass")String pass)
	{
		//System.out.println("name"+name+"pass"+pass);
		
		if(uservice.UserLogin(name, pass)) 
		{
			return "productpage"; 
		}
		return "userlogin";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	//@ResponseBody
	public String UserRegisterPage()
	{
		return "registeruser";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	//@ResponseBody
	public String UserRegister(@RequestParam("username")String name,@RequestParam("userpass")String pass,@RequestParam("umail")String mail,@RequestParam("ucname")String custname,@RequestParam("ucaddr")String addr)
	{	
		uservice.addUser(name,pass,mail,custname,addr);
		return "productpage";
	}
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	//@ResponseBody
	public String updateprod(Model model)
	{	
		List<User> userlist=uservice.loadUsers();
		model.addAttribute("users", userlist);
		return "showusers";
	}
}
