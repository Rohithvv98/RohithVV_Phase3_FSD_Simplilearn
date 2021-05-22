package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Product;


@Service
public class ProductService {
	@Autowired
	private ProductDao productdao;

	public void addProduct(int id,String name,String desc,int price,int stock,int categoryid) {
		productdao.save(new Product(id,name,desc,price,stock,categoryid));
	}
	
	public void updateProduct(int id,String name,String desc,int price,int stock,int categoryid) {
		
		Optional<Product> find=productdao.findById(id);
		if(find.isPresent()) {	
			productdao.deleteById(id);
			productdao.save(new Product(id,name,desc,price,stock,categoryid));
		}
	}
	
	public void deleteProduct(int id) {
		
		Optional<Product> find=productdao.findById(id);
		if(find.isPresent()) {	
			productdao.deleteById(id);
		}
	}
	
	public List<Product> loadProducts(){
		ArrayList<Product> al=(ArrayList<Product>)productdao.findAll();
		return al;
	}
	
	public Product findProduct(int id) {
		
		Optional<Product> find=productdao.findById(id);
		if(find.isPresent()) {	
			Product product=new Product();
			ArrayList<Product> al=(ArrayList<Product>)productdao.findAll();
			return al.get(id);
		}
		
		return null;
		
	}
	
}
