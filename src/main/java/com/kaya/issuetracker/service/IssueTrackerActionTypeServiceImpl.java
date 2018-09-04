package com.kaya.issuetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaya.issuetracker.dao.ActionTypeRepository;
import com.kaya.issuetracker.model.ActionType;

@Service
public class IssueTrackerActionTypeServiceImpl implements IssueTrackerActionTypeService {
	
	private ActionTypeRepository actionTypeRepository;
	
	@Autowired
	public void setActionTypeRepository(ActionTypeRepository actionTypeRepository) {
		this.actionTypeRepository = actionTypeRepository;
	}

	@Override
	public List<ActionType> findAll() {
		return actionTypeRepository.findAll();
	}

	@Override
	public ActionType findById(Long id) {
		return actionTypeRepository.findById(id);
	}

	@Override
	public void createActionType(ActionType actionType) {
		actionTypeRepository.create(actionType);

	}

	@Override
	public void updateActionType(ActionType actionType) {
		actionTypeRepository.update(actionType);

	}

	@Override
	public void deleteActionType(Long id) {
		actionTypeRepository.delete(id);
	}

}
