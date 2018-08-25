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
@Table(name="t_issueMessage")
public class IssueMessage {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="issueTrackerSeqGen")
	@SequenceGenerator(name="issueTrackerSeqGen",sequenceName="issueTracker_sequence")
	private Long id;
	
	@Column(name="messageSubject")
	private String messageSubject;
	
	@Column(name="messageBody")
	private String messageBody;
	
	@Column(name="importanceLevel")
	private Integer importanceLevel;
	
	@Column(name="createDate")
	private Date createDate;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="issueId")
	private Issue issue;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessageSubject() {
		return messageSubject;
	}
	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	public Integer getImportanceLevel() {
		return importanceLevel;
	}
	public void setImportanceLevel(Integer importanceLevel) {
		this.importanceLevel = importanceLevel;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Issue getIssue() {
		return issue;
	}
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "IssueMessage [id=" + id + ", messageSubject=" + messageSubject + ", userId=" + user.getId() + ", issueId="
				+ issue.getId() + "]";
	}
	
	
}
