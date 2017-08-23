package com.glqdlt.myhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glqdlt.myhome.domain.User;
import com.glqdlt.myhome.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public List<User> find_AllUsers() {
		return userRepo.findAll();
	}

	@Override
	public void add_User(User user) {
		userRepo.save(user);
	}

	@Override
	public void del_User(Integer no) {
		userRepo.delete(no);
	}

}
