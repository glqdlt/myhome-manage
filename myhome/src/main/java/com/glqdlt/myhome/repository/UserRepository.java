package com.glqdlt.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glqdlt.myhome.domain.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findById(String Id);
	User findByNo(Integer no);

}
