package com.khauminhduy.services;

import java.util.List;

import com.khauminhduy.models.TicketType;

public interface TicketTypeService {

	TicketType find(String id);
	
	List<TicketType> getTickets();
}
