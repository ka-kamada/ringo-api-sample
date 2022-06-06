package com.example.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.repository.UserMapper;
import com.example.service.SearchUserService;

@Service
public class SearchUserServiceImpl implements SearchUserService {

	@Autowired
	private UserMapper mapper;

	/** 名前+生年月日検索 */
	@Override
	public List<User> readUser(String name, LocalDate birthdate) {

		List<User> list = new ArrayList<User>();

		list = this.mapper.getUser(name, birthdate);

		return list;
	}
}
