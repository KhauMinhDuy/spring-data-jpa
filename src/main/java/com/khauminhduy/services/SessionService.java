package com.khauminhduy.services;

import java.util.List;

import com.khauminhduy.models.Session;

public interface SessionService {

	Session create(Session session);

	Session update(Session session);

	void delete(Long id);

	Session find(Long id);

	List<Session> list();

	List<Session> getSessionThatHaveName(String name);

	List<Session> getSessionContaines(String name);

	List<Session> findBySessionNameNotLike(String sessionName);

	List<Session> findBySessionNameIs(String sessionName);

	List<Session> findBySessionNameStartingWith(String sessionName);

	List<Session> findBySessionNameEndingWith(String sessionName);

	List<Session> findBySessionNameContaining(String sessionName);

	List<Session> findBySessionLengthNot(Integer sessionLength);

	List<Session> findBySessionLengthEquals(Integer sessionLength);

	List<Session> findBySessionLengthLessThan(Integer sessionLength);
	
	List<Session> findBySessionLengthGreaterThan(Integer sessionLength);
}
