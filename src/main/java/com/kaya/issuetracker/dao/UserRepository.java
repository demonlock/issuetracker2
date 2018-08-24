package com.kaya.issuetracker.dao;

import java.util.List;

import com.kaya.issuetracker.model.User;

public interface UserRepository {
	List<User> findAll();
	User findById(Long id);
	User findByUserName(String userName); 
	List<User> findByBranchId(Long id);
	void create(User user);
	User update(User user);
	void delete(Long id);
	
}
