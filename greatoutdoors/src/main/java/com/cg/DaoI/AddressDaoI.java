package com.cg.DaoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Address;
@Repository
public interface AddressDaoI extends JpaRepository<Address, String> {

}
