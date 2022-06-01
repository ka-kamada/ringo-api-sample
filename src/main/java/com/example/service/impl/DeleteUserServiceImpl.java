package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.User;
import com.example.repository.UserMapper;
import com.example.service.DeleteUserService;

@Service
public class DeleteUserServiceImpl implements DeleteUserService {

	@Autowired
	private UserMapper mapper;

	/** ID検索 */
	@Override
	public User readDeleteUser(String id) {

		User user = this.mapper.getUserId(id);

		return user;
	}

	/** 削除 */
	@Override
	public void deleteUser(User user) {

		user.userDelete(user);

		this.mapper.deleteUser(user.getId(), user.getDeletedAt(), user.getDeletedBy());

	}

}
