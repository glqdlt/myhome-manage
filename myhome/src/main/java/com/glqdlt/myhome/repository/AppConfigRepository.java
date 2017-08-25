package com.glqdlt.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glqdlt.myhome.domain.app.AppConfig;

public interface AppConfigRepository extends JpaRepository<AppConfig, Integer> {

	
}
