package com.ran.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ran.movie.model.User;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.userServerPath}")
	private String userServerPath;

	@GetMapping("/movie/user/{id}")
	private User getUser(@PathVariable int id) {
		return restTemplate.getForObject(userServerPath + id, User.class);
	}
}
