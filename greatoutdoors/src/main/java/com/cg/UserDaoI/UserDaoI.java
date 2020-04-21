package com.cg.UserDaoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.User;
@Repository
public interface UserDaoI extends JpaRepository<User, String> {

}
