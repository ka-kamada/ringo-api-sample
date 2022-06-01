package com.example.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.repository.UserMapper;
import com.example.service.RegisterUserService;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	@Autowired
	private UserMapper mapper;

	/** 登録 */
	@Override
	public void createUser(String name, LocalDate birthdate) {

		this.mapper.setUser(User.userNew(name, birthdate));
	}

}
