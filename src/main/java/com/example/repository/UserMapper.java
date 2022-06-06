package com.example.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.bean.User;

@Mapper
public interface UserMapper {

	/** 登録 */
	public void setUser(User user);

	/** 検索 */
	public List<User> getUser(@Param("name") String name, @Param("birthdate") LocalDate birthdate);

	/** ID検索 */
	public User getUserId(String id);

	/** 削除 */
	public void deleteUser(@Param("id") String id, @Param("deletedAt") LocalDateTime deletedAt,
			@Param("deletedBy") String deletedBy);

	/** 更新 */
	public void updateUser(User user);

}
