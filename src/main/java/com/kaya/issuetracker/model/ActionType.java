package com.kaya.issuetracker.model;

public class ActionType {
	private Long id;
	private String actionName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	@Override
	public String toString() {
		return "ActionType [id=" + id + ", actionName=" + actionName + "]";
	}
	
	

}
