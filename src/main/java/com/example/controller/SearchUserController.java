package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.SearchUserForm;
import com.example.bean.User;
import com.example.bean.UserResponse;
import com.example.service.SearchUserService;

@RestController
public class SearchUserController {

	@Autowired
	private SearchUserService searchUserService;

	@Autowired
	private ModelMapper modelMapper;


	@GetMapping("/users")
	public List<UserResponse> searchUser(@ModelAttribute SearchUserForm form) {

		List<UserResponse> listResponse = new ArrayList<UserResponse>();

		List<User> list = this.searchUserService.readUser(form.getName(), form.getBirthdate());

		// Listの中身を変換
		for (int i = 0; i < list.size(); i++) {

			UserResponse userResponse = this.modelMapper.map(list.get(i), UserResponse.class);
			listResponse.add(userResponse);

		}
		return listResponse;

	}
}