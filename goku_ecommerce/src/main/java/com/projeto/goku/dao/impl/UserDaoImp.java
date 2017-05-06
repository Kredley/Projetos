package com.projeto.goku.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.projeto.goku.beans.User;
import com.projeto.goku.dao.UserDao;

@Repository("userDao")
public class UserDaoImp implements UserDao {
	
	@Autowired
	JdbcTemplate template;  

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public User getUser(User user) {
		
		try {
			 User resultQuery = new User();
			 String sql= "select * from users where username=?";  
			 resultQuery = template.queryForObject(sql, new Object[]{user.getUsername()},new BeanPropertyRowMapper<User>(User.class));
			 return resultQuery;
		} catch (EmptyResultDataAccessException  e) {
			return null;
		}
	}
	
	
	

	@Override
	public void createUser(User user) {
		
	    String sql="insert into users(username,password,enabled) values('"+user.getUsername()+"','"+user.getPassword()+"',"+user.getEnabled()+")";  
	    template.update(sql);  	
	}
	

	@Override
	public void createRoleUser(String username, String role) {
		String sql="insert into user_roles(username,role) values('"+username+"','"+role+"')";    
	    template.update(sql);
		
	}

	@Override
	public void updateUser(User user) {
		String sql="update users set password ='" +user.getPassword()+"' where username='"+user.getUsername()+"'";  
	    template.update(sql); 
		
	}


}
