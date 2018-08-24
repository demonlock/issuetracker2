package com.kaya.issuetracker.model;

import java.util.HashSet;
import java.util.Set;

public class Branch {
	private Long id;
	private String branchName;
	private Set<User> users = new HashSet<>();
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	@Override
	public String toString() {
		return "Branches [id=" + id + ", branchName=" + branchName + "]";
	}
	
	
}
