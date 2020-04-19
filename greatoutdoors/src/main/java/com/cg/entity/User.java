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
	@Id
	private String userId;
	
	@Column
	private String password;
	
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
