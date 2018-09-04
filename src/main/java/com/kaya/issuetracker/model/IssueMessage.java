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
@Table(name="t_issuemessage")
public class IssueMessage {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="issueTrackerSeqGen")
	@SequenceGenerator(name="issueTrackerSeqGen",sequenceName="issuetracker_sequence")
	private Long id;
	
	@Column(name="messagesubject")
	private String messageSubject;
	
	@Column(name="messagebody")
	private String messageBody;
	
	@Column(name="importancelevel")
	private Integer importanceLevel;
	
	@Column(name="createdate")
	private Date createDate;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="issueid")
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
