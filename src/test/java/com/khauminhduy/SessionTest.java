package com.khauminhduy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.khauminhduy.models.Session;
import com.khauminhduy.services.SessionService;

@SpringBootTest
class SessionTest {

	@Autowired
	private SessionService sessionService;

	@Test
	void testJpaNot() {
		List<Session> lengthNot = sessionService.findBySessionLengthNot(1);
		assertTrue(lengthNot.size() > 0);
	}

	@Test
	void testJpaEquals() {
		List<Session> lengthEquals = sessionService.findBySessionLengthEquals(1);
		assertEquals(0, lengthEquals.size());
	}

	@Test
	void testJpaNotLike() {
		List<Session> nameNotLike = sessionService.findBySessionNameNotLike("Keynote%");
		assertEquals(2L, nameNotLike.get(0).getSessionId());
		assertTrue(nameNotLike.size() > 0);
	}

	@Test
	void testJpaIs() {
		List<Session> name = sessionService.findBySessionNameIs("Keynote - The Golden Age of Software");
		assertEquals(1, name.get(0).getSessionId());
	}

	@Test
	void testJpaStartWith() {
		List<Session> nameStartingWith = sessionService.findBySessionNameStartingWith("Keynote");
		assertNotNull(nameStartingWith);
		assertEquals(1, nameStartingWith.get(0).getSessionId());
	}

	@Test
	void testJpaEndWith() {
		List<Session> nameEndingWith = sessionService.findBySessionNameEndingWith("Software");
		assertNotNull(nameEndingWith);
		assertEquals(1, nameEndingWith.get(0).getSessionId());
	}

	@Test
	void testJpaLessThan() {
		List<Session> lessThan = sessionService.findBySessionLengthLessThan(45);
		assertNotNull(lessThan);
		assertTrue(lessThan.size() > 0);

		List<Session> lessThan2 = sessionService.findBySessionLengthLessThan(10);
		assertEquals(0, lessThan2.size());
	}

	@Test
	void testJpaGreaterThan() {
		List<Session> greaterThan = sessionService.findBySessionLengthGreaterThan(45);
		assertTrue(greaterThan.size() > 0);

		List<Session> greaterThan2 = sessionService.findBySessionLengthGreaterThan(80);
		assertEquals(0, greaterThan2.size());
	}

	@Test
	void testPageable() {
		Page<Session> sessionWithName = sessionService.getSessionWithName("S",
				PageRequest.of(1, 5, Sort.by(Sort.Direction.DESC, "sessionLength")));
		assertTrue(sessionWithName.getTotalElements() > 0);
	}
	
	@Test
	void testCustomRepository() {
		List<Session> sessions = sessionService.customGetSessions();
		assertTrue(sessions.size() > 0);
	}

}
