package com.example.service;

import com.example.bean.User;

public interface DeleteUserService {

	/** ID検索 */
	public User readDeleteUser(String id);

	/** 削除 */
	public void deleteUser(User user);

}
