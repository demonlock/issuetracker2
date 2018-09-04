package com.kaya.issuetracker.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kaya.issuetracker.dao.UserRepository;
import com.kaya.issuetracker.model.User;

@Repository
public class UserRepositoryJpaImpl implements UserRepository {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<User> findAll() {
		return entityManager.createQuery("from User",User.class).getResultList();
	}

	@Override
	public User findById(Long id) {
		return entityManager.createQuery("from User where id=:id",User.class).setParameter("id", id).getSingleResult();
	}

	@Override
	public User findByUserName(String userName) {
		return entityManager.createQuery("from User where username=:username",User.class).setParameter("username", userName).getSingleResult();
	}

	@Override
	public List<User> findByBranchId(Long id) {
		return entityManager.createQuery("from User where branch.id=:id",User.class).setParameter("id", id).getResultList();
	}

	@Override
	public void create(User user) {
		entityManager.persist(user);

	}

	@Override
	public User update(User user) {
		return entityManager.merge(user);
	}

	@Override
	public void delete(Long id) {
		entityManager.remove(entityManager.getReference(User.class, id));

	}

}
