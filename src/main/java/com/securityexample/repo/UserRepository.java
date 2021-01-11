package com.securityexample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securityexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);

}
