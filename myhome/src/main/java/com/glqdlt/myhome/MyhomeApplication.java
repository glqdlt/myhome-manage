package com.glqdlt.myhome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.glqdlt.myhome.domain.User;
import com.glqdlt.myhome.repository.UserRepository;


@EnableJpaRepositories(basePackages="com.glqdlt.myhome.*")
@EntityScan(basePackages="com.glqdlt.myhome.*")
@ComponentScan(basePackages="com.glqdlt.myhome.*")
@SpringBootApplication
public class MyhomeApplication implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(MyhomeApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		userRepo.save(new User("전일웅", "jhun", "jhun1234", "jhun@jhun.com", "Seoul", "010-1234-1234", 9));
		userRepo.save(new User("박치훈", "park", "park1234", "park@park.com", "Seoul", "010-1234-1234", 1));
		
		
		
	}
}
