package com.auth.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.auth.server.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUserName(String userName);

}
