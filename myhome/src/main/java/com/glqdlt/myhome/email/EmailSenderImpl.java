package com.glqdlt.myhome.email;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.glqdlt.myhome.domain.app.AppConfig;
import com.glqdlt.myhome.domain.user.User;
import com.glqdlt.myhome.repository.AppConfigRepository;

@Component
public class EmailSenderImpl implements EmailSender {

	// http://www.baeldung.com/spring-email
	@Autowired
	JavaMailSender eSender;

	@Autowired
	AppConfigRepository appRepo;

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
		List<AppConfig> appconfig = appRepo.findAll();
		msg.setSubject(appconfig.get(0).getEmail_subject());
		msg.setText(appconfig.get(0).getEmail_writer());

		return msg;

	}

}
