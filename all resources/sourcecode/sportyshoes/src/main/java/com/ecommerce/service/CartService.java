package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.CartDao;
import com.ecommerce.model.Cart;


@Service
public class CartService {
	@Autowired
	private CartDao cartdao;

	public void addCart(int id,int pid,int quantity,int price,String pname,String uname) {
		cartdao.save(new Cart(id,pid,quantity,price,pname,uname));
	}
	
	public void updateCart(int id,int pid,int quantity,int price,String pname,String uname) {
		
		Optional<Cart> find=cartdao.findById(id);
		if(find.isPresent()) {	
			cartdao.deleteById(id);
			cartdao.save(new Cart(id,pid,quantity,price,pname,uname));
		}
	}
	
	public void deleteCart(int id) {
		
		Optional<Cart> find=cartdao.findById(id);
		if(find.isPresent()) {	
			cartdao.deleteById(id);
		}
	}
	
	public List<Cart> loadCarts(){
		ArrayList<Cart> al=(ArrayList<Cart>)cartdao.findAll();
		return al;
	}
	
	public boolean findCart(int id) {
		
		Optional<Cart> find=cartdao.findById(id);
		if(find.isPresent()) {	
			return true;
		}
		
		return false;
		
	}
}
