package com.broadway.springboot.service;

import com.broadway.springboot.model.User;

public interface UserService {
	public void addUser(User user);
public User isUserExist(String un);
public User userLogin(String un,String pw);

	
}
