package com.khauminhduy.services;

import java.util.List;

import com.khauminhduy.models.Speaker;

public interface SpeakerService {

	Speaker create(Speaker speaker);

	Speaker update(Speaker speaker);

	void delete(Long id);

	Speaker find(Long id);

	List<Speaker> list();

	List<Speaker> findByFirstNameAndLastName(String firstname, String lastname);

	List<Speaker> findByFirstNameOrLastName(String firstname, String lastname);
	
	List<Speaker> findByCompanyIgnoreCase(String company);
	
	List<Speaker> findByFirstNameOrderByLastNameAsc(String firstname);
	
	List<Speaker> findFirstByFirstName(String firstname);
}
