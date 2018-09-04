package com.kaya.issuetracker.service;

import java.util.List;

import com.kaya.issuetracker.model.IssueAction;

public interface IssueTrackerIssueActionService {

	List<IssueAction> findAll();
	List<IssueAction> findByIssueId(Long issueId);
	IssueAction findById(Long id);
	void createIssueAction(IssueAction issueAction);
	void updateIssueAction(IssueAction issueAction);
	void deleteIssueAction(Long id);
}
