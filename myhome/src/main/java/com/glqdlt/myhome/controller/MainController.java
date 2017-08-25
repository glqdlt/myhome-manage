package com.glqdlt.myhome.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.glqdlt.myhome.domain.user.User;
import com.glqdlt.myhome.email.EmailSender;
import com.glqdlt.myhome.repository.UserRepository;

@RequestMapping(value = "/")
@Controller
public class MainController {

	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	EmailSender emailSender;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		logger.info("Welcome Home..");

		return "home";
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		
		return "join";
	}
	@RequestMapping(value = "/setting", method = RequestMethod.GET)
	public String calc() {
		
		return "settings";
	}
	@RequestMapping(value = "/mail", method = RequestMethod.GET)
	public void mail() {
		
		User user = new User();
		user.setEmail("glqdlt@naver.com");
		emailSender.send(user);
		
	}
	
	
}
