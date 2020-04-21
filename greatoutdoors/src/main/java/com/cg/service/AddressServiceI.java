package com.cg.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Address;

public interface AddressServiceI extends JpaRepository<Address, String> {

}
