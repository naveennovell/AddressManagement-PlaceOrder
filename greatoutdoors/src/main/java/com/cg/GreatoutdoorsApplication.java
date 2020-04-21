package com.cg;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.UserService.UserService;
import com.cg.entity.Address;
import com.cg.entity.User;
import com.cg.service.AddressServiceI;



@SpringBootApplication
public class GreatoutdoorsApplication implements CommandLineRunner {
	@Autowired
	AddressServiceI addressservice;
	
	@Autowired
	UserService userservice;	

	public static void main(String[] args) {
	
		
		
		SpringApplication.run(GreatoutdoorsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		Address address1 = new Address();
		Address address2 = new Address();
		
		user1.setUserId("11604879");
		user1.setPhoneNumber("9133131345");
		user1.setEmail("naveennoveell143@gmail.com");
		user1.setRole("manager");
		user1.setPassword("dinesh123");

		
		
		//Address
		address1.setAddressId("1");
		address1.setBuldingNo("6-32");
		address1.setCity("ibrahimpatan");
		address1.setField("analyst");
		address1.setRetailerId("101");
		address1.setState("telangana");
		address1.setZip("501508");
		
		
		address2.setAddressId("2");
		address2.setBuldingNo("7-54");
		address2.setCity("ibrahimpatan");
		address2.setField("analyst");
		address2.setRetailerId("201");
		address2.setState("telangana");
		address2.setZip("501508");
		
		user1.getAddress().add(address1);
		user1.getAddress().add(address2);
		userservice.save(user1);
		addressservice.save(address1);
		addressservice.save(address2);
		
		
		
		
		
		
	}


		
		
	}

		
	


		

