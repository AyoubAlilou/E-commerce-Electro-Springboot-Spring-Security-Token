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

import com.example.demo.Entity.CategorieEntity;
import com.example.demo.Entity.ProductEntity;
import com.example.demo.Service.CategorieService;

import lombok.AllArgsConstructor;
@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/api/categorie")
public class CategorieController {
	@Autowired
	private CategorieService categorieService;
	
	@PostMapping("/add")
	public CategorieEntity saveToBD(@RequestBody CategorieEntity electronicEntity) {
		return categorieService.addElectronicToBD(electronicEntity);
	}
	@PutMapping("/")
	public CategorieEntity updateToBD(@RequestBody CategorieEntity electronicEntity) {
	 return categorieService.updateElectronicToBD(electronicEntity);
	}
	
	@GetMapping("/")
	public List<CategorieEntity> getAll() {
		return categorieService.getAll();
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		categorieService.delete(id);
    }
	@GetMapping("/{id}")
	public CategorieEntity getById(@PathVariable int id) {
	return categorieService.findElectronicById(id);
	}
    
	@GetMapping("/findAllProducts/{id}")
	public List<ProductEntity> getAllProducts(@PathVariable int id) {
		return categorieService.getAllproduct(id);
	}
	
}
