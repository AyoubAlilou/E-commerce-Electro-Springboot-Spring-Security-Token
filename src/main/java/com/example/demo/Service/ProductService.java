package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.ProductEntity;
import com.example.demo.Repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
	private ProductRepository productrepository;
	
	public ProductEntity addProductToBD(ProductEntity productEntity) {
		return productrepository.save(productEntity);
	}
	public List<ProductEntity> getAll() {
	  return productrepository.findAll();
	}
	  
	public ProductEntity updateElectronicToBD(ProductEntity productEntity) {
	  return productrepository.save(productEntity);
	}
		
	public ProductEntity findElectronicById(int id) {
		Optional<ProductEntity> find = productrepository.findById(id);
		return find.isPresent() ? find.get() : null;
	}
	public void delete(int id) {
		 productrepository.deleteById(id);;
	}
} 
