
package com.example.bean;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class UserForm {

	@NotBlank
	private String name;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;

	public String getName() {
		return this.name;
	}

	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

}
