package com.auth.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.auth.server.model.AppClient;


@Repository
public interface ClientRepository extends CrudRepository<AppClient, String> {

	AppClient findByClientId(String clientId);

}
