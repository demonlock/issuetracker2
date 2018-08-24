package com.kaya.issuetracker.dao;

import java.util.List;

import com.kaya.issuetracker.model.Issue;

public interface IssueRepository {
	List<Issue> findAll();
	List<Issue> findByUserId(Long userId,Integer Closed);
	List<Issue> findByUserIdWithActionTypeId(Long userId,Long ActionTypeId,Integer Closed);
	Issue findById(Long id);
	void create(Issue issue);
	Issue update(Issue issue);
	void delete(Long id);
}
