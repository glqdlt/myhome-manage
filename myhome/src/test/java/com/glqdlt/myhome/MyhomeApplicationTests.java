package com.glqdlt.myhome;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import com.glqdlt.myhome.domain.user.User;
import com.glqdlt.myhome.email.EmailSender;


@EnableJpaRepositories(basePackages = "com.glqdlt.myhome.*")
@EntityScan(basePackages = "com.glqdlt.myhome.*")
@ComponentScan(basePackages = "com.glqdlt.myhome.*")
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyhomeApplicationTests {

	//https://gist.github.com/ihoneymon/56dd964336322eea04dc
	
	@Autowired
	EmailSender emailSender;
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void emailSend(){

		
	}

}
