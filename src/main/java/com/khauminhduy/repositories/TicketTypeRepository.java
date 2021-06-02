package com.khauminhduy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khauminhduy.models.TicketType;

@Repository
public interface TicketTypeRepository extends JpaRepository<TicketType, String>{

}
