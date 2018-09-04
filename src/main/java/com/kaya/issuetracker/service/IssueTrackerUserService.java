package com.kaya.issuetracker.service;

import java.util.List;

import com.kaya.issuetracker.model.User;

public interface IssueTrackerUserService {
	List<User> findAll();
	User findById(Long id);
	User findByUserName(String userName);
	List<User> findByBranchId(Long id);
	void createUser(User user);
	void updateUser(User user);
	void deleteUser(Long id);
}
