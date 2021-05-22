package com.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.AdminDao;
import com.ecommerce.model.Admin;



@Service
public class AdminService {
	@Autowired
	private AdminDao admindao;

	public boolean AdminLogin(String name,String pass) {

			Optional<Admin> find=admindao.findById(name);
			if(find.isPresent()) {
			
			Optional<Admin> aname=admindao.findById(name);
			Optional<Admin> apass=admindao.findById(pass);
			if(aname.isPresent()&&(apass.isPresent()))
			{
					return true;
				
			}
		}
		
			return false;
			
	}
	
	public void updateAdmin(String name,String pass) {
		
		Optional<Admin> find=admindao.findById(name);
		if(find.isPresent()) {	
			admindao.deleteById(name);
			admindao.save(new Admin(name,pass));
		}
	}

	public void UpdatePass(String name, String pass, String newpass) {
		Optional<Admin> find=admindao.findById(name);
		if(find.isPresent()) {	
			admindao.deleteById(name);
			admindao.save(new Admin(name,newpass));
		}
	}
}
