package com.kaya.issuetracker.dao;

import java.util.List;

import com.kaya.issuetracker.model.Branch;

public interface BranchRepository {
	List<Branch> findAll();
	Branch findById(Long id);
	List<Branch> findByBranchName(String branchName);
	void create(Branch branch);
	Branch update(Branch branch);
	void delete(Long id);
}
