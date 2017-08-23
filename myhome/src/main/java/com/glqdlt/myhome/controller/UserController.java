package com.glqdlt.myhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.glqdlt.myhome.domain.User;
import com.glqdlt.myhome.service.UserService;

@RequestMapping(value="/user")
@RestController
public class UserController {
	
	@Autowired
	UserService userServ;
	

	@RequestMapping(value ="/all" , method = RequestMethod.GET)
	public List<User> findAllUsers(){
		return userServ.find_AllUsers();
	}
	

}
