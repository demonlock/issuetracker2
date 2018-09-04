package com.kaya.issuetracker.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.kaya.issuetracker.dao.IssueActionRepository;
import com.kaya.issuetracker.model.IssueAction;

@Repository
@Transactional
public class IssueActionRepositoryJpaImpl implements IssueActionRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<IssueAction> findByAll() {
		return entityManager.createQuery("from IssueAction",IssueAction.class).getResultList();
	}

	@Override
	public List<IssueAction> findByIssueId(Long issueId) {
		return entityManager.createQuery("from IssueAction where issue.id=:issueId",IssueAction.class).setParameter("issueId", issueId).getResultList();
	}

	@Override
	public List<IssueAction> findByUserIdWithActionTypeId(Long userId, Long actionTypeId) {
		return entityManager.createQuery("from IssueAction where user.id=:userId and actionType.id=:actionTypeId",IssueAction.class).
				setParameter("userId", userId).
				setParameter("actionTypeId",actionTypeId).
				getResultList();
	}

	@Override
	public IssueAction findById(Long id) {
		return entityManager.createQuery("from IssueAction where id=:id",IssueAction.class).setParameter("id", id).getSingleResult();
	}

	@Override
	public void create(IssueAction issueAction) {
		entityManager.persist(issueAction);

	}

	@Override
	public IssueAction update(IssueAction issueAction) {
		return entityManager.merge(issueAction);
	}

	@Override
	public void delete(Long id) {
		entityManager.remove(entityManager.getReference(IssueAction.class, id));

	}

	@Override
	public void deleteByIssueId(Long issueId) {
		entityManager.createQuery("delete from IssueAction where issue.id=:issueId").setParameter("issueId", issueId)
		.executeUpdate();

	}

}
