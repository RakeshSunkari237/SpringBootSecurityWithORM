package com.securityexample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securityexample.model.User;
import com.securityexample.repo.UserRepository;
import com.securityexample.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public Integer saveUser(User user) {
		User savedUser = userRepo.save(user);
		return savedUser.getUid();
	}

}
