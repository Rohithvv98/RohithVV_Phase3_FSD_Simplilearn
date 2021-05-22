package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.UserDao;
import com.ecommerce.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public boolean UserLogin(String name,String pass) {
		Optional<User> find=userDao.findById(name);
		if(find.isPresent()) {
			
			Optional<User> uname=userDao.findById(name);
			Optional<User> upass=userDao.findById(pass);
			if(uname.isPresent()&&(upass.isPresent()))
			{
					return true;
			}
		}
		
		return false;
		
	}

	public void addUser(String name,String pass,String email,String customername,String customerAddress) {
		userDao.save(new User(name,pass,email,customername,customerAddress));
	}
	
	public void updateUser(String username,String pass,String email,String customername,String customerAddress) {
		
		Optional<User> find=userDao.findById(username);
		if(find.isPresent()) {	
			userDao.deleteById(username);
			userDao.save(new User(username,pass,email,customername,customerAddress));
		}
	}
	
	public List<User> loadUsers(){
		ArrayList<User> al=(ArrayList<User>)userDao.findAll();
		return al;
	}
	
	public boolean findUser(String user) {
		
		Optional<User> find=userDao.findById(user);
		if(find.isPresent()) {	
			return true;
		}
		
		return false;
		
	}
	
	
}
