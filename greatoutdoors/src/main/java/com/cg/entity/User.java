package com.cg.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user00")
public class User {
	public User()
	{
		
	}
	@Id
	private String userId;
	
	@Column
	private String password;
	
	public User(String userId, String password, String role, String phoneNumber, String email, Set<Address> address) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	@Column
	private String role;
	
	@Column 
	private String phoneNumber;
	
	@Column
	private String email;
	
	@OneToMany
	@JoinColumn(name="addressId")
	private Set<Address> address;
	
}
