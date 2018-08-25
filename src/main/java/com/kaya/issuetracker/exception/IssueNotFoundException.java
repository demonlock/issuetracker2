package com.kaya.issuetracker.exception;

@SuppressWarnings("serial")
public class IssueNotFoundException extends RuntimeException {

	public IssueNotFoundException(String message) {
		super(message);
	}

}
