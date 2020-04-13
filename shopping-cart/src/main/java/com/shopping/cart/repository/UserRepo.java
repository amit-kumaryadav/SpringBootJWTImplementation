package com.shopping.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.cart.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUserName(String username);
}
