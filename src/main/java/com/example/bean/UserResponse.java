package com.example.bean;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserResponse {

	private String id;
	private String name;
	private LocalDate birthdate;

}
