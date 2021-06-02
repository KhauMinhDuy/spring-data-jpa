package com.khauminhduy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khauminhduy.models.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

	List<Session> findBySessionName(String sessionName);

	List<Session> findBySessionNameContains(String sessionName);

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
