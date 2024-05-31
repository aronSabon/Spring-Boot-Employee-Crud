package com.broadway.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.broadway.springboot.model.User;
import com.broadway.springboot.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService us;
	
	@GetMapping({"/Login","/"})
	private String getUser() {
		return "Login";
	}
	
	@PostMapping("/Login")
	private String postUser(@ModelAttribute User user,Model model) {
		User u =us.userLogin(user.getUsername(), user.getPassword());
		if(u!=null) {
			model.addAttribute("username", user.getUsername());
			return "Home";
		}
		model.addAttribute("loginMessage", "username or password doesnot match");
		return "Login";
	}
	
	@GetMapping("/SignUp")
	private String getSignUp() {
		return "Signup";
	}
	
	@PostMapping("/SignUp")
	private String postSignUp(@ModelAttribute User user,Model model) {
		User u =us.isUserExist(user.getUsername());
		if(u!=null) {
			model.addAttribute("signUpMessage", "User already exists");
			return "SignUp";
		}
		us.addUser(user);
		return "Login";
	}


}
