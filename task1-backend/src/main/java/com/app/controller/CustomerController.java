package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.UserRepository;
import com.app.pojos.Response;
import com.app.pojos.User;
import com.app.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private UserService userservice;

	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/login")
	public ResponseEntity<?> processLoginForm(User user) {
		// System.out.println("in process login form " + username + " " + password +"
		// "+map) ;
		try {
			// @RequestParam(name="username") String username,
			// @RequestParam(name="password") String password, Model map
			userservice.authenticateUser(user.getUsername(), user.getPassword());
			// map.addAttribute("user_info", user);
			return Response.success(user);

		} catch (RuntimeException e) {
			System.out.println("err in class " + getClass() + "in  process login form " + e);
			return null;
		}

	}
	
	@GetMapping("/getAllProduct")
	public ResponseEntity<?> getAllScrapPostDetails() {
		System.out.println("In getAllScrapPostDetails()");
		return new ResponseEntity<>(userservice.getAllScrappost(), HttpStatus.OK);
	}

	@PostMapping("/addUser")
	public User adduser(@RequestBody @Valid User user) {
		return userservice.adduser(user);
		}
	
}
