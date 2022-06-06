package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.pojos.Products;
import com.app.pojos.User;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

		List<Products> findByPname(String pname);
	
		List<Products> findByptype(String ptype);
		
		List<Products> findByPcategory(String pcategory);
		
		List<Products> findByPprice(int pprice);
		
//		@Query("select s from Products s  where user_id= :user_id")
//		List<Products>  findByUser(User user_id);

		}

