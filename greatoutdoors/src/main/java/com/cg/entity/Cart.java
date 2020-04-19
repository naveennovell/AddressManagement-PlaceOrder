package com.cg.entity;	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="cart00")
	public class Cart {
		
		@Id
		private String userId;
		
		@Column
		private String productId;
		
		@Column
		private int quantity;

	}

