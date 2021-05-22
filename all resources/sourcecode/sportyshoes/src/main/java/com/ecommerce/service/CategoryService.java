package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.CategoryDao;
import com.ecommerce.model.Category;


@Service
public class CategoryService {

	@Autowired
	private CategoryDao categorydao;

	public void addCategory(int id,String name,String desc) {
		categorydao.save(new Category(id,name,desc));
	}
	
	public void updateCategory(int id,String name,String desc) {
		
		Optional<Category> find=categorydao.findById(id);
		if(find.isPresent()) {	
			categorydao.deleteById(id);
			categorydao.save(new Category(id,name,desc));
		}
	}
	
	public void deleteCategory(int id) {
		
		Optional<Category> find=categorydao.findById(id);
		if(find.isPresent()) {	
			categorydao.deleteById(id);
		}
	}
	
	public List<Category> loadCategories(){
		ArrayList<Category> al=(ArrayList<Category>)categorydao.findAll();
		return al;
	}
	
	public boolean findCategory(int id) {
		
		Optional<Category> find=categorydao.findById(id);
		if(find.isPresent()) {	
			return true;
		}
		
		return false;
		
	}
}
