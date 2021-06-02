package com.khauminhduy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khauminhduy.models.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

	List<Speaker> findByFirstNameAndLastName(String firstname, String lastname);
	
	List<Speaker> findByFirstNameOrLastName(String firstname, String lastname);
	
}
