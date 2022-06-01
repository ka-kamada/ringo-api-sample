package com.example.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import de.huxhorn.sulky.ulid.ULID;
import lombok.Data;

@Data
public class User {


	private final String id;
	private String name;
	private LocalDate birthdate;
	private boolean deleted;
	private LocalDateTime createdAt;
	private String createdBy;
	private LocalDateTime updatedAt;
	private String updatedBy;
	private LocalDateTime deletedAt;
	private String deletedBy;

	User(String name, LocalDate birthdate, String createdBy) {

		ULID ulid = new ULID();

		this.id = ulid.nextULID();

		this.name = name;
		this.birthdate = birthdate;
		this.createdBy = createdBy;
		this.updatedBy = createdBy;

		LocalDateTime now = LocalDateTime.now();
		this.createdAt = now;
		this.updatedAt = now;
	}

	User(String id, String name, LocalDate birthdate, boolean deleted, LocalDateTime createdAt, String createdBy,
			LocalDateTime updatedAt, String updatedBy, LocalDateTime deletedAy, String deletedBy) {

		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.deleted = deleted;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.deletedAt = deletedAy;
		this.deletedBy = deletedBy;

	}

	public static User userNew(String name, LocalDate birthdate, String createdBy) {

		return new User(name, birthdate, createdBy);


	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public LocalDate getBirthdate() {
		return this.birthdate;
	}

}
