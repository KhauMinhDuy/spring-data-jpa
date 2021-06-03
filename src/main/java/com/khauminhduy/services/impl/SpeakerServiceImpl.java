package com.khauminhduy.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khauminhduy.models.Speaker;
import com.khauminhduy.repositories.SpeakerRepository;
import com.khauminhduy.services.SpeakerService;

@Service
public class SpeakerServiceImpl implements SpeakerService{

	@Autowired
	private SpeakerRepository speakerRepository;
	
	@Override
	public Speaker create(Speaker speaker) {
		return speakerRepository.saveAndFlush(speaker);
	}

	@Override
	public Speaker update(Speaker speaker) {
		return speakerRepository.saveAndFlush(speaker);
	}

	@Override
	public void delete(Long id) {
		speakerRepository.deleteById(id);
	}

	@Override
	public Speaker find(Long id) {
		return speakerRepository.getOne(id);
	}

	@Override
	public List<Speaker> list() {
		return speakerRepository.findAll();
	}

	@Override
	public List<Speaker> findByFirstNameAndLastName(String firstname, String lastname) {
		return speakerRepository.findByFirstNameAndLastName(firstname, lastname);
	}

	@Override
	public List<Speaker> findByFirstNameOrLastName(String firstname, String lastname) {
		return speakerRepository.findByFirstNameOrLastName(firstname, lastname);
	}

	@Override
	public List<Speaker> findByCompanyIgnoreCase(String company) {
		return speakerRepository.findByCompanyIgnoreCase(company);
	}

	@Override
	public List<Speaker> findByFirstNameOrderByLastNameAsc(String firstname) {
		return speakerRepository.findByFirstNameOrderByLastNameAsc(firstname);
	}

	@Override
	public List<Speaker> findFirstByFirstName(String firstname) {
		return speakerRepository.findFirstByFirstName(firstname);
	}

}
