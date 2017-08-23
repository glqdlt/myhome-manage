package com.glqdlt.myhome.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glqdlt.myhome.domain.User;
import com.glqdlt.myhome.repository.UserRepository;

@RequestMapping(value = "/user")
@RestController
public class UserController {

	@Autowired
	UserRepository userRepo;

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "/find/all", method = RequestMethod.GET)
	public List<User> findAllUsers() {
		return userRepo.findAll();
	}

	@RequestMapping(value = "/find/{no}", method = RequestMethod.GET)
	public User findUser(@PathVariable("no") Integer no) {

		return userRepo.findByNo(no);

	}

	/**
	 * 이건.. html form 으로 보내는 개념, 사실 Jquery든 angular 든 application/json 형태로 쏴줘야하는 데, theymleaf 를 잘 모르겄다, 헤헷
	 * @param name
	 * @param id
	 * @param password
	 * @param email
	 * @param address
	 * @param phone
	 * @return
	 */
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public ResponseEntity<?> joinUser(
			@RequestParam(name = "name") String name, @RequestParam(name = "id") String id,
			@RequestParam(name = "password") String password, @RequestParam(name = "email") String email,
			@RequestParam(name = "address") String address, @RequestParam(name = "phone") String phone

	) {

		logger.info("Welcome to join User");
		userRepo.save(new User(name, id, password, email, address, phone, 1));
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	// 리얼 rest
//	Sample Json
//	{
//		"no": 3,
//		"name": "김개똥",
//		"id": "kim",
//		"password": "kim1234",
//		"email": "kim@jhun.com",
//		"address": "Seoul",
//		"phone": "010-1234-1234",
//		"role": 9
//		}	
//	 @RequestMapping(value = "/join", method = RequestMethod.POST)
//	 public ResponseEntity<?> joinUser(@RequestBody User user) {
//	
//	 logger.info("Welcome to join User");
//	 logger.info(user.toString());
//	 userRepo.save(user);
//	 return new ResponseEntity<>(HttpStatus.CREATED);
//	 }
	 
	 

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public String authUser(@RequestParam(name = "id") String id, @RequestParam(name = "password") String password) {

		User user = userRepo.findById(id);
		if (user != null) {

			if (user.getPassword().equals(password)) {
				return "Nice to meet you, " + user.getId();
			}

		}

		return "Fuck You";

	}

}
