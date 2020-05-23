package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.UserDetail;
import com.cg.repository.LoginRepository;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

	   @Autowired
	   private LoginRepository  loginRepository;
	   
	   @GetMapping("login")
	   public UserDetail  validate(@RequestBody UserDetail  user)
	   {
		     return null;//loginRepository.findUserByNameAndPassword(user.getUserName(),user.getUserPass());
	   }
	
}
