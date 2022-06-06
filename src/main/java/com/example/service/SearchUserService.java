package com.example.service;

import java.time.LocalDate;
import java.util.List;

import com.example.bean.User;

public interface SearchUserService {

	/** 検索 */
	public List<User> readUser(String name, LocalDate birthdate);

}
