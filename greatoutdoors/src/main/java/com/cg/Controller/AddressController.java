package com.cg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Address;
import com.cg.entity.Product;
import com.cg.service.AddressServiceI;
@RestController
public class AddressController {
	@Autowired
	AddressServiceI addressservice;
	@PostMapping(value="/Address/add",consumes = {"application/json"})
	public String addAddress(@RequestBody Address address)
	{
	   addressservice.save(address);
	   return "Address added";
	}

}
