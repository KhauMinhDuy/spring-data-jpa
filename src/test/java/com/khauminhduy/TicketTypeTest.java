package com.khauminhduy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.khauminhduy.models.TicketType;
import com.khauminhduy.services.TicketTypeService;

@SpringBootTest
class TicketTypeTest {

	@Autowired
	private TicketTypeService ticketTypeService;
	
	@Test
	void testFindId() {
		TicketType ticketType = ticketTypeService.find("C");
		assertNotNull(ticketType);
	}
	
	@Test
	void testFindAll() {
		List<TicketType> tickets = ticketTypeService.getTickets();
		assertNotNull(tickets);
		assertTrue(tickets.size() > 0);
		assertEquals("P", tickets.get(0).getTicketTypeCode());
	}

}
