package com.projeto.goku.service;

import com.projeto.goku.beans.User;

public interface UserService {
	
	public User getUser(User user);
	
	public void createUser(User user);
	
	public void updateUser(User user);

}
