package com.projeto.goku.dao;

import com.projeto.goku.beans.User;

public interface UserDao {
	
	public User getUser(User user);
	
	public void createUser(User user);
	
	public void updateUser(User user);

	public void createRoleUser(String username, String role);

}
