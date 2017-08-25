package com.glqdlt.myhome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.glqdlt.myhome.domain.user.User;
import com.glqdlt.myhome.repository.UserRepository;

/**
 * 같은 패키지에 있는 component 가 아니면 인식을 못하기 때문에, 아래와 같이 패키지 경로를 작성해줘야함. 정규식도 먹히는듯.
 * 
 * @author iw.jhun
 *
 */
@EnableJpaRepositories(basePackages = "com.glqdlt.myhome.*")
@EntityScan(basePackages = "com.glqdlt.myhome.domain.*")
@ComponentScan(basePackages = "com.glqdlt.myhome.*")
@SpringBootApplication
public class MyhomeApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(MyhomeApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		userRepo.save(new User("전일웅", "jhun", "jhun1234", "jhun@jhun.com", "Seoul", "010-1234-1234", 9));
		userRepo.save(new User("박치훈", "park", "park1234", "park@park.com", "Seoul", "010-1234-1234", 1));
		userRepo.save(new User("홍길동", "hong", "hong1234", "hong@hong.com", "Seoul", "010-1234-1234", 1));

	}
}
