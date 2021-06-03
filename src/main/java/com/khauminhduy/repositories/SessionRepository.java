package com.khauminhduy.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.khauminhduy.models.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>, SessionHibernateRepository {

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
	
	@Query(value = "SELECT s FROM Session s WHERE s.sessionName like %:name")
	Page<Session> getSessionWithName(@Param("name") String name, Pageable pageable);
	

}
