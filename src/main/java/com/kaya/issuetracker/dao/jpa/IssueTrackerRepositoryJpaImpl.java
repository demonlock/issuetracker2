package com.kaya.issuetracker.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.kaya.issuetracker.dao.IssueRepository;
import com.kaya.issuetracker.model.Issue;

@Repository
public class IssueTrackerRepositoryJpaImpl implements IssueRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Issue> findAll() {
		return entityManager.createQuery("from Issue", Issue.class).getResultList();
	}

	@Override
	public List<Issue> findByUserId(Long userId, Integer Closed) {
		return entityManager.createQuery("from Issue where userId=:userId and closed=:closed",Issue.class).
				setParameter("userId", userId).
				setParameter("closed",Closed).getResultList();
	}

	@Override
	public List<Issue> findByUserIdWithActionTypeId(Long userId, Long ActionTypeId, Integer Closed) {
		return entityManager.createQuery("from Issue where userId=:userId and actionTypeId=:actionTypeId and closed=:closed",Issue.class).
				setParameter("userId", userId).
				setParameter("actionTypeId", ActionTypeId).
				setParameter("closed",Closed).getResultList();
	}

	@Override
	public Issue findById(Long id) {
		return entityManager.find(Issue.class, id);
	}

	@Override
	public void create(Issue issue) {
		entityManager.persist(issue);

	}

	@Override
	public Issue update(Issue issue) {
		return entityManager.merge(issue);
	}

	@Override
	public void delete(Long id) {
		entityManager.remove(entityManager.getReference(Issue.class, id));

	}

}