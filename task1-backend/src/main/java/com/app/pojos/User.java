package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseEntity{

	@Column(length = 45)
	private String fullname;
	
	@Column(length = 45,unique = true)
	private String email;
	
	@Column(nullable = false,length = 10,unique = true)
	private String contactNo;
	
	@Column(length = 45)
	private String address;
	
	
	@Column(length =40 )
	private String username;
	
	@Column(length =40 )
	private String password;
	
	@Column(length =40 )
	private String role;
	
	
	
	
	public User(String fullname, String email, String contactNo, String address, String username, String password,
			String role) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


}
