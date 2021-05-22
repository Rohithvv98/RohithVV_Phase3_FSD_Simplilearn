package com.ecommerce.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.service.CartService;



@Controller
@RequestMapping("/cart")
public class CartController {
	@Autowired
	public CartService caservice;
	
	@RequestMapping(value="/addtocart",method=RequestMethod.GET)
	@ResponseBody
	public String addproduct()
	{
	return "order succesfull";
	}

}
