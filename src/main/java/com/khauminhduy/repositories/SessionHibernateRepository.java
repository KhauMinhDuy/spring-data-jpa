package com.khauminhduy.repositories;

import java.util.List;

import com.khauminhduy.models.Session;

public interface SessionHibernateRepository {

	List<Session> customGetSessions();

}
