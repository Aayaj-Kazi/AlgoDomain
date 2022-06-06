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
		
		return Products.findAll();   
	}

	@Override
	public String deleteProducts(Integer Id) {
		Products.deleteById(Id);
		return "Products of ID "+Id +"Deleted Succesfully" ;    //delete Products uploaded by same user
	}
	@Override
	public String deleteProduct(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public User adduser(User user) {				
		return userRepo.save(user);
	}

	@Override
	public Products addscrappost(Products scrappost) {
		return scrapRepo.save(scrappost);
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
		return Products.findById(Id);
	}

	@Override
	public Optional<Products> findByUser(int user_id) {
		
		return Products.findById(user_id);
	}

	@Override
	public Products addProduct(Products product) {
		// TODO Auto-generated method stub
		return null;
	}

	
	


	
	

	

}
