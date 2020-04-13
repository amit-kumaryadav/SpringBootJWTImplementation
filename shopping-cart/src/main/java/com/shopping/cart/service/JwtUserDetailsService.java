package com.shopping.cart.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shopping.cart.repository.UserRepo;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.shopping.cart.model.User user = userRepository.findByUserName(username);
		if (user != null) {
			return new User(user.getUserName(), user.getPassword(), new ArrayList<>());
		}
		throw new UsernameNotFoundException("User not found with username: " + username);
	}
}