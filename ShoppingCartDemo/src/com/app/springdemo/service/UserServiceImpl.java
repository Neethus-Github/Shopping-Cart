package com.app.springdemo.service;

import java.util.List;

import javax.persistence.Access;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springdemo.dao.UserDAO;
import com.app.springdemo.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	@Transactional
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDAO.getUsers();
	}


	@Override
	@Transactional
	public void saveUser(User theUser) {
		// TODO Auto-generated method stub
		userDAO.saveUser(theUser);
	}


	@Override
	@Transactional
	public List<User> loginUser(String username,String password) {
		// TODO Auto-generated method st
		return userDAO.loginUser(username,password);
	}


	@Override
	@Transactional
	public User getUser(int theId) {
		// TODO Auto-generated method stub
		return  userDAO.getUser(theId);
	}
	

	@Override
	@Transactional
	public void deleteUser(int theId) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(theId);
	}
	
	
	
}
