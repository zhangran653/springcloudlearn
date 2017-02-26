package com.ran.user.service.spi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ran.user.model.User;
import com.ran.user.repository.UserRepository;
import com.ran.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User read(int id) {
		return userRepository.findOne(id);
	}

}
