package com.adil.controller;

import com.adil.domain.User;
import com.adil.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bahramudin ADIL
 * @created 20/05/2023 - 1:14 AM
 */
@RestController
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("users")
	public List<User> users() {
		return userService.listAll();
	}
	
}
