
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

	private String createdBy = "api";

	private String updatedBy = "api";

	public String getName() {
		return this.name;
	}

	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
