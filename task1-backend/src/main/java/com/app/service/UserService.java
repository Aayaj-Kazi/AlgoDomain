package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.pojos.Products;
import com.app.pojos.User;

public interface UserService {

	User adduser(User user);

	Products addProduct(Products product);

	List<Products> getAllScrappost();

	// to delete post
	String deleteProduct(Integer Id);


	User findByUsername(String username);
	
	User authenticateUser(String username, String password);
	
	Optional<Products> findById(Integer Id);
	
	
	Optional<Products> findByUser(int user_id);
}
