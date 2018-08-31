package com.kaya.issuetracker.dao;

import java.util.List;

import com.kaya.issuetracker.model.IssueAction;

public interface IssueActionRepository {
	List<IssueAction> findByAll();
	List<IssueAction> findByIssueId(Long issueId);
	List<IssueAction> findByUserIdWithActionTypeId(Long userId,Long actionTypeId);
	IssueAction findById(Long id);
	void create(IssueAction issueAction);
	IssueAction update(IssueAction issueAction);
	void delete(Long id);
	void deleteByIssueId(Long issueId);
}
