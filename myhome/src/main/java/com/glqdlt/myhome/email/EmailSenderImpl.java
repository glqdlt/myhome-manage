package com.glqdlt.myhome.email;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.glqdlt.myhome.domain.user.User;

@Component
public class EmailSenderImpl implements EmailSender {

	// http://www.baeldung.com/spring-email
	@Autowired
	JavaMailSender eSender;


	@Override
	public void send(User user) {
		eSender.send(makeBody(user));

	}

	@Override
	public void sendArray(List<User> user_list) {

		user_list.forEach(x -> eSender.send(makeBody(x)));

	}

	@Override
	public SimpleMailMessage makeBody(User user) {

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(user.getEmail());
		msg.setSubject("test email");
		msg.setText("text");
		msg.setFrom("setFrom");

		return msg;

	}

}
