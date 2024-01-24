package com.projeto.goku.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.projeto.goku.beans.User;
import com.projeto.goku.dao.UserDao;
import com.projeto.goku.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public User getUser(User user) {
		return userDao.getUser(user);
		
	}

	@Override
	public void createUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		user.setPassword(encoder.encode(user.getPassword()));
		String a = "2";
		userDao.createUser(user);
		userDao.createRoleUser(user.getUsername(), user.getRole());
		
		
	}

	@Override
	public void updateUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		user.setPassword(encoder.encode(user.getPassword()));
		userDao.updateUser(user);
		
	}

}
