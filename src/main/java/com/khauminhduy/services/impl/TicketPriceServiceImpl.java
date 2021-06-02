package com.khauminhduy.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khauminhduy.models.TicketPrice;
import com.khauminhduy.repositories.TicketPriceRepository;
import com.khauminhduy.services.TicketPriceService;

@Service
public class TicketPriceServiceImpl implements TicketPriceService {

	@Autowired
	private TicketPriceRepository ticketPriceRepository;
	
	@Override
	public TicketPrice create(TicketPrice ticketPrice) {
		return ticketPriceRepository.saveAndFlush(ticketPrice);
	}

	@Override
	public TicketPrice update(TicketPrice ticketPrice) {
		return ticketPriceRepository.saveAndFlush(ticketPrice);
	}

	@Override
	public void delete(Long id) {
		ticketPriceRepository.deleteById(id);
	}

	@Override
	public TicketPrice find(Long id) {
		return ticketPriceRepository.getOne(id);
	}

	@Override
	public List<TicketPrice> list() {
		return ticketPriceRepository.findAll();
	}

}
