package com.khauminhduy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khauminhduy.models.TicketPrice;

@Repository
public interface TicketPriceRepository extends JpaRepository<TicketPrice, Long>{
    
}
