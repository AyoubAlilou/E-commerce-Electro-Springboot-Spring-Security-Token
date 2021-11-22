package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ProductEntity;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	@Query("SELECT u FROM product u WHERE u.categorie.id = ?1")
	List<ProductEntity> findByIdCategorie(int id);

}
