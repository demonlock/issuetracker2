package com.kaya.issuetracker.dao;

import java.util.List;

import com.kaya.issuetracker.model.IssueMessage;

public interface IssueMessageRepository {
	List<IssueMessage> findByAll();
	List<IssueMessage> findByIssueId(Long issueId);
	IssueMessage findById(Long id);
	void create(IssueMessage issueMessage);
	IssueMessage update(IssueMessage issueMessage);
	void delete(Long id);
	void deleteByIssueId(Long issueId);
}
