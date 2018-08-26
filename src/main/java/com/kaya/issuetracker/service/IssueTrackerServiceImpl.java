package com.kaya.issuetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaya.issuetracker.dao.IssueRepository;
import com.kaya.issuetracker.exception.IssueNotFoundException;
import com.kaya.issuetracker.model.Issue;

@Service
public class IssueTrackerServiceImpl implements IssueTrackerService {
	
	private IssueRepository issueRepository;
	
	@Autowired
	public void setIssueRepository(IssueRepository issueRepository) {
		this.issueRepository = issueRepository;
	}

	@Override
	public List<Issue> findIssue() {
		return issueRepository.findAll();
	}

	@Override
	public List<Issue> findIssueByUserId(Long userId) {
		return issueRepository.findByUserId(userId, 0);
	}

	@Override
	public Issue findIssue(Long id) throws IssueNotFoundException {
		Issue issue = issueRepository.findById(id);
		if (issue==null) throw new IssueNotFoundException("Issue Not Found By Id : "+id);
		return issue;
	}

	@Override
	public void createIssue(Issue issue) {
		issueRepository.create(issue);
	}

	@Override
	public void updateIssue(Issue issue) {
		issueRepository.update(issue);
	}

	@Override
	public void deleteIssue(Long issueId) {
		issueRepository.delete(issueId);
	}

}
