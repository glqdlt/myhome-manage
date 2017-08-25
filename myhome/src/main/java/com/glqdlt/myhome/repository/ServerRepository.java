package com.glqdlt.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glqdlt.myhome.domain.server.Server;

public interface ServerRepository extends JpaRepository<Server, Integer> {

}
