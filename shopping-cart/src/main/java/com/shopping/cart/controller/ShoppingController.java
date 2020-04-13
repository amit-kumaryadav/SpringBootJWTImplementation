package com.shopping.cart.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ShoppingController {
	@PostMapping("/hello")
	public String getMessage() {
		return "Hello message!!";
	}
}
