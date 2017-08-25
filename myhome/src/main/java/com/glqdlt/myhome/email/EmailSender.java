package com.glqdlt.myhome.email;

import java.util.List;

import org.springframework.mail.SimpleMailMessage;

import com.glqdlt.myhome.domain.user.User;

public interface EmailSender {

	public void send(User user);
	public void sendArray(List<User> user_list);
	
	SimpleMailMessage makeBody(User user);
}
