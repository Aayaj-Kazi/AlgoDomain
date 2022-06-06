package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ProductRepository;
import com.app.dao.UserRepository;

import com.app.pojos.Products;

import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private  ProductRepository productRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<Products> getAllScrappost() {
		
		return productRepo.findAll();   
	}

	@Override
	public String deleteProduct(Integer Id) {
		productRepo.deleteById(Id);
		return null;
	}

	

	@Override
	public User adduser(User user) {				
		return userRepo.save(user);
	}

	@Override
	public Products addProduct(Products product) {
		return productRepo.save(product);
	}


	@Override
	public User findByUsername(String username) {
		return  userRepo.findByUsername(username);
	}



	@Override
	public User authenticateUser(String username, String password) {
		return userRepo.findByUsernameAndPassword(username, password)
				.orElseThrow(() -> new RuntimeException("User login failed : Invalid Credentials"));
	}

	@Override
	public Optional<Products> findById(Integer Id) {
		return productRepo.findById(Id);
	}

	@Override
	public Optional<Products> findByUser(int user_id) {
		
		return productRepo.findById(user_id);
	}

	
	


	
	

	

}
