package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address00")
public class Address {
	public Address()
	{
		
	}
	@Id
	private String AddressId;
	@Column
	private String retailerId;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zip;
	@Column
	private String buldingNo;
	public Address(String addressId, String retailerId, String city, String state, String zip, String buldingNo,
			String field) {
		super();
		AddressId = addressId;
		this.retailerId = retailerId;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.buldingNo = buldingNo;
		this.field = field;
	}
	@Column
	private String field;
	public String getAddressId() {
		return AddressId;
	}
	public void setAddressId(String addressId) {
		AddressId = addressId;
	}
	public String getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getBuldingNo() {
		return buldingNo;
	}
	public void setBuldingNo(String buldingNo) {
		this.buldingNo = buldingNo;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}


}
