package com.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Admin;

@Repository
public interface AdminDao extends CrudRepository<Admin, String>{

}
