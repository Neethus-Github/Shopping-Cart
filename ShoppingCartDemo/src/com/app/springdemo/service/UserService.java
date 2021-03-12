package com.app.springdemo.service;

import java.util.List;

import com.app.springdemo.entity.User;

public interface UserService {
	
	public List<User> getUsers();
	public void saveUser(User theUser);
	public List<User> loginUser(String username,String password);
	public User getUser(int theId);
	public void deleteUser(int theId); 
}
