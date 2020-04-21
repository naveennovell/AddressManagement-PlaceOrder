package com.cg.UserService;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.User;

public interface UserService extends JpaRepository<User, String> {

}
