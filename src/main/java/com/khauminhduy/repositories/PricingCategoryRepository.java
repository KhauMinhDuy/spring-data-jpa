package com.khauminhduy.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khauminhduy.models.PricingCategory;

@Repository
public class PricingCategoryRepository {
    @PersistenceContext
    private EntityManager entityManager;
    
    @Autowired
    private PricingCategoryJpaRepository pricingCategoryRepository;

    public PricingCategory find(String id) {
        return pricingCategoryRepository.getOne(id);
    }
}
