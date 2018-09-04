package com.kaya.issuetracker.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.kaya.issuetracker.dao.ActionTypeRepository;
import com.kaya.issuetracker.model.ActionType;

@Repository
public class ActionTypeRepositoryJpaImpl implements ActionTypeRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<ActionType> findAll() {
		return entityManager.createQuery("from ActionType",ActionType.class).getResultList();
	}

	@Override
	public ActionType findById(Long id) {
		return entityManager.createQuery("from ActionType where id=:id",ActionType.class)
				.setParameter("id", id).getSingleResult();
	}

	@Override
	public void create(ActionType actionType) {
		entityManager.persist(actionType);

	}

	@Override
	public ActionType update(ActionType actionType) {
		return entityManager.merge(actionType);
	}

	@Override
	public void delete(Long id) {
		entityManager.remove(entityManager.getReference(ActionType.class, id));

	}

}
