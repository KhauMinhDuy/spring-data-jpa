package com.khauminhduy.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.khauminhduy.models.TicketPrice;

public interface TicketPriceService {

	TicketPrice create(TicketPrice tp);
	
	TicketPrice update(TicketPrice tp);
	
	void delete(Long id);
	
	TicketPrice find(Long id);
	
	List<TicketPrice> list();
	
	List<TicketPrice> getTicketsUnderPriceWithWorkShops(BigDecimal maxPrice);
	
	List<TicketPrice> namedFindTicketsByPricingCategoryName(@Param("name") String name);
}
