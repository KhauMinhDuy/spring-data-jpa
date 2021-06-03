package com.khauminhduy.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.khauminhduy.models.TicketPrice;

@Repository
public interface TicketPriceRepository extends JpaRepository<TicketPrice, Long>{
    
	@Query("SELECT tp FROM TicketPrice tp WHERE tp.basePrice < ?1")
	List<TicketPrice> getTicketsUnderPriceWithWorkShops(BigDecimal maxPrice);
	
}
