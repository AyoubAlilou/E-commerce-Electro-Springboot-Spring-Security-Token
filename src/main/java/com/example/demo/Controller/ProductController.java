package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ProductEntity;
import com.example.demo.Service.ProductService;

import lombok.AllArgsConstructor;
@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/api/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/add")
	public ProductEntity saveToBD(@RequestBody ProductEntity productEntity) {
		return productService.addProductToBD(productEntity);
	}
	@PutMapping("/")
	public ProductEntity updateToBD(@RequestBody ProductEntity productEntity) {
	 return productService.updateElectronicToBD(productEntity);
	}
	@GetMapping("/")
	public List<ProductEntity> getAll() {
		return productService.getAll();
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		productService.delete(id);
    }
	@GetMapping("/{id}")
	public ProductEntity getById(@PathVariable int id) {
	return productService.findElectronicById(id);
	}

}
