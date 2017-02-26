package com.ran.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ran.user.model.User;
import com.ran.user.service.UserService;

@RestController()
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user/{id}")
	private User getUser(@PathVariable int id) {
		return userService.read(id);
	}
}
