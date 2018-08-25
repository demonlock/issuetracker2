package com.kaya.issuetracker.model;

import java.util.Date;
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
@Table(name="t_issue")
public class Issue {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="issueTrackerSeqGen")
	@SequenceGenerator(name="issueTrackerSeqGen",sequenceName="issueTracker_sequence")
	private Long id;
	
	@Column(name="createDate")
	private Date createDate;
	
	@Column(name="scheduledDate")
	private Date scheduledDate;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="body")
	private String body;
	
	@Column(name="closed")
	private Integer closed;
	
	@OneToMany
	private Set<IssueMessage> issueMessages= new HashSet<>();
	
	@OneToMany
	private Set<IssueAction> issueActions=new HashSet<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Integer getClosed() {
		return closed;
	}
	public void setClosed(Integer closed) {
		this.closed = closed;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public Set<IssueMessage> getIssueMessages() {
		return issueMessages;
	}
	public void setIssueMessages(Set<IssueMessage> issueMessages) {
		this.issueMessages = issueMessages;
	}
	public Set<IssueAction> getIssueActions() {
		return issueActions;
	}
	public void setIssueActions(Set<IssueAction> issueActions) {
		this.issueActions = issueActions;
	}
	@Override
	public String toString() {
		return "Issue [id=" + id + ", subject=" + subject + ", closed=" + closed + "]";
	}

	
}
