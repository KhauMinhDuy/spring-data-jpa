package com.khauminhduy.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khauminhduy.models.Session;
import com.khauminhduy.repositories.SessionRepository;
import com.khauminhduy.services.SessionService;

@Service
public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionRepository sessionRepository;

	@Override
	public Session create(Session session) {
		return sessionRepository.saveAndFlush(session);
	}

	@Override
	public Session update(Session session) {
		return sessionRepository.saveAndFlush(session);
	}

	@Override
	public void delete(Long id) {
		sessionRepository.deleteById(id);
	}

	@Override
	public Session find(Long id) {
		return sessionRepository.getOne(id);
	}

	@Override
	public List<Session> list() {
		return sessionRepository.findAll();
	}

	@Override
	public List<Session> getSessionThatHaveName(String name) {
		return sessionRepository.findBySessionName(name);
	}

	@Override
	public List<Session> getSessionContaines(String name) {
		return sessionRepository.findBySessionNameContains(name);
	}

	@Override
	public List<Session> findBySessionLengthNot(Integer sessionLength) {
		return sessionRepository.findBySessionLengthNot(sessionLength);
	}

	@Override
	public List<Session> findBySessionLengthEquals(Integer sessionLength) {
		return sessionRepository.findBySessionLengthEquals(sessionLength);
	}

	@Override
	public List<Session> findBySessionNameNotLike(String sessionName) {
		return sessionRepository.findBySessionNameNotLike(sessionName);
	}

	@Override
	public List<Session> findBySessionNameIs(String sessionName) {
		return sessionRepository.findBySessionNameIs(sessionName);
	}

	@Override
	public List<Session> findBySessionNameStartingWith(String sessionName) {
		return sessionRepository.findBySessionNameStartingWith(sessionName);
	}

	@Override
	public List<Session> findBySessionNameEndingWith(String sessionName) {
		return sessionRepository.findBySessionNameEndingWith(sessionName);
	}

	@Override
	public List<Session> findBySessionNameContaining(String sessionName) {
		return sessionRepository.findBySessionNameContaining(sessionName);
	}

	@Override
	public List<Session> findBySessionLengthLessThan(Integer sessionLength) {
		return sessionRepository.findBySessionLengthLessThan(sessionLength);
	}

	@Override
	public List<Session> findBySessionLengthGreaterThan(Integer sessionLength) {
		return sessionRepository.findBySessionLengthGreaterThan(sessionLength);
	}

}
