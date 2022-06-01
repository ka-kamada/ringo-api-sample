package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.bean.UserForm;
import com.example.repository.UserMapper;
import com.example.service.UpdateUserService;

@Service
public class UpdateUserServiceImpl implements UpdateUserService {

	@Autowired
	private UserMapper mapper;

	/** ID検索 */
	@Override
	public User readUpdateUser(String id) {

		User user = this.mapper.getUserId(id);

		return user;
	}

	/** 更新 */
	@Override
	public void updateUser(User user, UserForm form) {

		this.mapper.updateUser(user.userUpdate(user, form.getName(), form.getBirthdate()));

	}

}
