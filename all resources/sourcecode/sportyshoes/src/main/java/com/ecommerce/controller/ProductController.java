package com.ecommerce.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	public ProductService pservice;
	@RequestMapping(value="/manage",method=RequestMethod.GET)
	//@ResponseBody
	public String manageprod()
	{
		return "manageprod";
	}
	@RequestMapping(value="/addprod",method=RequestMethod.GET)
	//@ResponseBody
	public String Addprod()
	{
		return "addprod";
	}

	@RequestMapping(value="/addprod",method=RequestMethod.POST)
	//@ResponseBody
	public String addproduct(@RequestParam("pid")int prodId,@RequestParam("pname")String prodName,@RequestParam("pdesc")String prodDesc,@RequestParam("price")int pPrice,@RequestParam("stock")int pStock,@RequestParam("cid")int Cid,@RequestParam("pimage")MultipartFile filedet)
	{	Product product=new Product();
	pservice.addProduct(prodId, prodName, prodDesc, pPrice, pStock, Cid);
	String imagepath="C:\\Users\\User\\Desktop\\java-simplilearn\\phase3projessesntials\\sportyshoes\\sportyshoes\\src\\main\\webapp\\resources\\images\\";
	imagepath=imagepath+String.valueOf((product.getProductId()+1)+".jpg");

	File image=new File(imagepath);
	if(!filedet.isEmpty())
	{
		try
		{
			byte buff[]=filedet.getBytes();
			FileOutputStream fos=new FileOutputStream(image);
			BufferedOutputStream bs=new BufferedOutputStream(fos);
			bs.write(buff);
			bs.close();
		}
		catch(Exception e){
			System.out.println("exception");
		}
	}
	return "manageprod";
	}

	@RequestMapping(value="/updateprod",method=RequestMethod.GET)
	//@ResponseBody
	public String Showprod(Model model)
	{
		List<Product> productlist=pservice.loadProducts();
		model.addAttribute("products", productlist);
		return "updateprod";
	}
	@RequestMapping(value="/updpro",method=RequestMethod.GET)
	//@ResponseBody
	public String updateprod()
	{	
		return "updprod";
	}
	@RequestMapping(value="/updpro",method=RequestMethod.POST)
	//@ResponseBody
	public String updateprod(@RequestParam("pname")String prodName,@RequestParam("pdesc")String prodDesc,@RequestParam("price")int pPrice,@RequestParam("stock")int pStock,@RequestParam("cid")int Cid,Model model)
	{	
		List<Product> productlist=pservice.loadProducts();
		model.addAttribute("products", productlist);
		return "updateprod";
	}
	@RequestMapping(value="/delpro/{productId}",method=RequestMethod.GET)
	//@ResponseBody
	public String deleteprod(Model model,@RequestParam("productId")int productId)
	{	pservice.deleteProduct(productId);
	return "updateprod";
	}

	@RequestMapping(value="/productpage",method=RequestMethod.GET)
	//@ResponseBody
	public String disp(Model model)
	{	

		List<Product> productlist1=pservice.loadProducts();
		model.addAttribute("productss", productlist1);

		return "productpage";
	}
	@RequestMapping(value="/productpage",method=RequestMethod.POST)
	//@ResponseBody
	public String displ(Model model)
	{	

		List<Product> productlist1=pservice.loadProducts();
		model.addAttribute("productss", productlist1);

		return "productpage";
	}
	
	@RequestMapping(value="/totaldisplay/",method=RequestMethod.GET)
	//@ResponseBody
	public String display()
	{	
		return "totaldisplay";
	}
	@RequestMapping(value="/totaldisplay/{productId}",method=RequestMethod.POST)
	//@ResponseBody
	public String display(@PathVariable(value="productId")int productid,Model model)
	{	
		model.addAttribute("pageinfo", "Product Info");
		Product product=pservice.findProduct(productid);
		return "totaldisplay";
	}
}
