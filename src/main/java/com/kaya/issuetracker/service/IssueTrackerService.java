package com.kaya.issuetracker.service;

import java.util.List;

import com.kaya.issuetracker.exception.IssueNotFoundException;
import com.kaya.issuetracker.model.Issue;
import com.kaya.issuetracker.model.IssueAction;

public interface IssueTrackerService {
	List<Issue> findIssue();
	List<Issue> findIssueByUserId(Long userId);
	List<IssueAction> findIssuesByActionType(Long userId,Long actionTypeId);
	Issue findIssue(Long id) throws IssueNotFoundException;
	void createIssue(Issue issue);
	void updateIssue(Issue issue);
	void deleteIssue(Long issueId);
}
