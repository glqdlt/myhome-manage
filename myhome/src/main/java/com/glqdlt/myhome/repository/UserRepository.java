package com.glqdlt.myhome.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.glqdlt.myhome.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByIdAndPassword(String Id,String password);
	
	User findById(String Id);
	
}
