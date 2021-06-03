package com.khauminhduy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khauminhduy.models.PricingCategory;

@Repository
public interface PricingCategoryRepository extends JpaRepository<PricingCategory, String>{

}
