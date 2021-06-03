package com.khauminhduy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khauminhduy.models.PricingCategory;
import com.khauminhduy.repositories.PricingCategoryRepository;
import com.khauminhduy.services.PricingCategoryService;

@Service
public class PricingCategoryServiceImpl implements PricingCategoryService {

	@Autowired
	private PricingCategoryRepository pricingCategoryRepository;
	
	@Override
	public PricingCategory find(String id) {
		return pricingCategoryRepository.getOne(id);
	}

}
