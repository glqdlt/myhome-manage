package com.glqdlt.myhome.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glqdlt.myhome.domain.User;
import com.glqdlt.myhome.service.UserService;

@RequestMapping(value = "/user")
@RestController
public class UserController {

	@Autowired
	UserService userServ;

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> findAllUsers() {
		return userServ.find_AllUsers();
	}

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public String authUser(@RequestParam(name = "id") String id, @RequestParam(name = "password") String password) {

		User user = userServ.findById(id);
		if (user != null) {

			if (user.getPassword().equals(password)) {
				return "Nice to meet you, " + user.getId();
			}

		}

		return "Fuck You";

	}

}
