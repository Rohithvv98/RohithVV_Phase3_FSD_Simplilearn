package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;



@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	public CategoryService cservice;
	@RequestMapping(value="/manage",method=RequestMethod.GET)
	//@ResponseBody
	public String manageprod()
	{
		return "managecat";
	}
	@RequestMapping(value="/addcat",method=RequestMethod.GET)
	//@ResponseBody
	public String Addprod()
	{
		return "addcat";
	}
	
	@RequestMapping(value="/addcat",method=RequestMethod.POST)
	//@ResponseBody
	public String addproduct(@RequestParam("cid")int Cid,@RequestParam("cname")String catName,@RequestParam("cdesc")String catDesc)
	{
		cservice.addCategory(Cid, catName, catDesc);
		return "managecat";
	}
	@RequestMapping(value="/updatecat",method=RequestMethod.GET)
	//@ResponseBody
	public String Showprod(Model model)
	{
		List<Category> categorylist=cservice.loadCategories();
		model.addAttribute("categories", categorylist);
		return "updatecat";
	}
	@RequestMapping(value="/updcat",method=RequestMethod.GET)
	//@ResponseBody
	public String updateprod()
	{	
		return "updcat";
	}
	@RequestMapping(value="/updcat",method=RequestMethod.POST)
	//@ResponseBody
	public String updateprod(@RequestParam("cname")String catName,@RequestParam("cdesc")String catDesc,Model model)
	{	
		List<Category> categorylist=cservice.loadCategories();
				model.addAttribute("categories", categorylist);
		return "updatecat";
}
}
