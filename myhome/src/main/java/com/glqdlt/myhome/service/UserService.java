package com.glqdlt.myhome.service;

import java.util.List;

import com.glqdlt.myhome.domain.User;

public interface UserService {
	
	public List<User> find_AllUsers();
	public void add_User(User user);
	public void del_User(Integer no);

}
