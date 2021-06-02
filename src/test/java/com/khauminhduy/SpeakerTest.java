package com.khauminhduy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.khauminhduy.models.Speaker;
import com.khauminhduy.services.SpeakerService;

@SpringBootTest
class SpeakerTest {

	@Autowired
	private SpeakerService speakerService;

	@Test
	void testDSLJpaOr() {
		List<Speaker> name = speakerService.findByFirstNameOrLastName("James", "Lowrey");
		assertNotNull(name);
		assertTrue(name.size() > 0);
	}

	@Test
	void testJpaAnd() {
		List<Speaker> name = speakerService.findByFirstNameAndLastName("Sergio", "Becker");
		assertNotNull(name);
		assertTrue(name.size() > 0);
		assertEquals(name.get(0).getFirstName(), "Sergio");
		
	}
}
