package com.kaya.issuetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaya.issuetracker.dao.IssueActionRepository;
import com.kaya.issuetracker.exception.IssueActionNotFoundException;
import com.kaya.issuetracker.model.IssueAction;

@Service
public class IssueTrackerIssueActionImpl implements IssueTrackerIssueActionService {
	
	private IssueActionRepository issueActionRepository;
	
	@Autowired
	public void setIssueActionRepository(IssueActionRepository issueActionRepository) {
		this.issueActionRepository = issueActionRepository;
	}

	@Override
	public List<IssueAction> findAll() {
		return issueActionRepository.findByAll();
	}

	@Override
	public List<IssueAction> findByIssueId(Long issueId) {
		return issueActionRepository.findByIssueId(issueId);
	}
	
	@Override
	public IssueAction findById(Long id) {
		IssueAction issueAction = issueActionRepository.findById(id);
		if(issueAction==null) throw new IssueActionNotFoundException("IssueAction not found by Id:"+id);
		return issueAction;
	}

	@Override
	public void createIssueAction(IssueAction issueAction) {
		issueActionRepository.create(issueAction);

	}

	@Override
	public void updateIssueAction(IssueAction issueAction) {
		issueActionRepository.update(issueAction);

	}

	@Override
	public void deleteIssueAction(Long id) {
		issueActionRepository.delete(id);

	}

}
