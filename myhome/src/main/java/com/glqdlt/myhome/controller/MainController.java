package com.glqdlt.myhome.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.glqdlt.myhome.repository.UserRepository;

@RequestMapping(value = "/")
@Controller
public class MainController {

	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	UserRepository userRepo;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		logger.info("Welcome Home..");

		return "home";
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		
		return "join";
	}
}
