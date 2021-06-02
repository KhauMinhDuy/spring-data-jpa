package com.khauminhduy.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khauminhduy.models.TicketType;
import com.khauminhduy.repositories.TicketTypeRepository;
import com.khauminhduy.services.TicketTypeService;

@Service
public class TicketTypeServiceImpl implements TicketTypeService {

	@Autowired
	private TicketTypeRepository ticketTypeRepository;
	
	@Override
	public TicketType find(String id) {
		return ticketTypeRepository.getOne(id);
	}

	@Override
	public List<TicketType> getTickets() {
		return ticketTypeRepository.findAll();
	}

}
