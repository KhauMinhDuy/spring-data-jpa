package com.khauminhduy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.khauminhduy.models.TicketPrice;
import com.khauminhduy.services.TicketPriceService;

@SpringBootTest
class TicketPriceTest {

	@Autowired
	private TicketPriceService ticketPriceService;

	@Test
	void testAnnotationQuery() {
		List<TicketPrice> priceWithWorkShops = ticketPriceService
				.getTicketsUnderPriceWithWorkShops(BigDecimal.valueOf(1000));
		assertTrue(priceWithWorkShops.size() > 0);
		
	}

}
