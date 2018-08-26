package com.kaya.issuetracker.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_issueaction")
public class IssueAction {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="issueTrackerSeqGen")
	@SequenceGenerator(name="issueTrackerSeqGen",sequenceName="issueTracker_sequence")
	private Long id;
	
	@Column(name="actiondate")
	private Date actionDate;
	
	@Column(name="read")
	private Integer read;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;

	@ManyToOne
	@JoinColumn(name="issueid")
	private Issue issue;
	
	@ManyToOne
	@JoinColumn(name="actiontypeid")
	private ActionType actionType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getActionDate() {
		return actionDate;
	}
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}
	public Integer getRead() {
		return read;
	}
	public void setRead(Integer read) {
		this.read = read;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Issue getIssue() {
		return issue;
	}
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	public ActionType getActionType() {
		return actionType;
	}
	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}
	@Override
	public String toString() {
		return "IssueAction [id=" + id + ", actionType=" + actionType.getId() + ", userId=" + user.getId() + ", issueId=" + issue.getId()
				+ "]";
	}
	
	
}
