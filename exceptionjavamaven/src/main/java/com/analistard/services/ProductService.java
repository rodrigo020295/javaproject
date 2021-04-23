package com.analistard.services;

import org.springframework.stereotype.Service;

import com.analistard.models.Product;
import com.analistard.repository.ProductRepository;
import com.analistard.services.exceptions.EntityNotFoundException;

@Service
public class ProductService {

	private ProductRepository productRepository;
	
	public Product findById(Long id) {
		return   productRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("Id not found" + id));
		
		
		
	}
	
}
