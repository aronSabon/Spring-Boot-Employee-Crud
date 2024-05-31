package com.broadway.springboot.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.broadway.springboot.model.User;
import com.broadway.springboot.repository.UserRepository;
import com.broadway.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
UserRepository ur;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		ur.save(user);
	}
	@Override
	public User isUserExist(String un) {
		// TODO Auto-generated method stub
		return ur.findByUsername(un);
	}
	@Override
	public User userLogin(String un, String pw) {
		// TODO Auto-generated method stub
		return ur.findByUsernameAndPassword(un, pw);
	}
	
}
