package com.kaya.issuetracker.model;

import java.util.Date;

public class IssueMessage {
	private Long id;
	
	private String messageSubject;
	private String messageBody;
	private Integer importanceLevel;
	private Date createDate;
	private Long userId; 
	private Long issueId;
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getIssueId() {
		return issueId;
	}
	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}
	public Issue getIssue() {
		return issue;
	}
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	@Override
	public String toString() {
		return "IssueMessage [id=" + id + ", messageSubject=" + messageSubject + ", userId=" + userId + ", issueId="
				+ issueId + "]";
	}
	
	
}
