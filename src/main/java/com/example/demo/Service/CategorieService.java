package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CategorieEntity;
import com.example.demo.Entity.ProductEntity;
import com.example.demo.Repository.CategorieRepository;
import com.example.demo.Repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategorieService {
  @Autowired
  private CategorieRepository categorierepository;
  @Autowired
  private ProductRepository productrepository;
  
  public CategorieEntity addElectronicToBD(CategorieEntity categorieEntity) {
	  return categorierepository.save(categorieEntity);
  }
  
  public List<CategorieEntity> getAll() {
	  return categorierepository.findAll();
  }
  
  public CategorieEntity updateElectronicToBD(CategorieEntity categorieEntity) {
	return categorierepository.save(categorieEntity);
  }
	
  public CategorieEntity findElectronicById(int id) {
		Optional<CategorieEntity> find = categorierepository.findById(id);
		 return find.isPresent() ? find.get() : null;
  }
  public void delete(int id) {
		categorierepository.deleteById(id);;
  }
  public List<ProductEntity>getAllproduct(int id){
  	return productrepository.findByIdCategorie(id);
   }
}
