package com.kaya.issuetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaya.issuetracker.dao.UserRepository;
import com.kaya.issuetracker.model.User;

@Service
public class IssueTrackerUserServiceImpl implements IssueTrackerUserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	@Override
	public List<User> findByBranchId(Long id) {
		return userRepository.findByBranchId(id);
	}

	@Override
	public void createUser(User user) {
		userRepository.create(user);

	}

	@Override
	public void updateUser(User user) {
		userRepository.update(user);
		

	}

	@Override
	public void deleteUser(Long id) {
		userRepository.delete(id);
		

	}

}
