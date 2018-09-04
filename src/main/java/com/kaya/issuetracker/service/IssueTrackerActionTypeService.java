package com.kaya.issuetracker.service;

import java.util.List;

import com.kaya.issuetracker.model.ActionType;

public interface IssueTrackerActionTypeService {
	List<ActionType> findAll();
	ActionType findById(Long id);
	void createActionType(ActionType actionType);
	void updateActionType(ActionType actionType);
	void deleteActionType(Long id);
	
	

}
