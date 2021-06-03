package com.khauminhduy.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.khauminhduy.models.Session;
import com.khauminhduy.repositories.SessionHibernateRepository;

public class SessionHibernateRepositoryImpl implements SessionHibernateRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Session> customGetSessions() {
		return entityManager.createQuery("FROM Session").getResultList();
	}

}
