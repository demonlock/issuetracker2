package com.kaya.issuetracker.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_actiontype")
public class ActionType {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="issueTrackerSeqGen")
	@SequenceGenerator(name="issueTrackerSeqGen",sequenceName="issuetracker_sequence")
	private Long id;
	
	@Column(name="actionname")
	private String actionName;
	
	@OneToMany(mappedBy="actionType")
	private Set<IssueAction> issueActions=new HashSet<>();
	
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
