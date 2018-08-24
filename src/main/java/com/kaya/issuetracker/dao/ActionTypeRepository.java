package com.kaya.issuetracker.dao;

import java.util.List;

import com.kaya.issuetracker.model.ActionType;

public interface ActionTypeRepository {
	List<ActionType> findAll();
	ActionType findById(Long id);
	void create(ActionType actionType);
	ActionType update(ActionType actionType);
	void delete(Long id);
}
