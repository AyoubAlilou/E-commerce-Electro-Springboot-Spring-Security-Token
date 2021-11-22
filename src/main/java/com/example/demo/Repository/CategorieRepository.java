package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.CategorieEntity;

public interface CategorieRepository extends JpaRepository<CategorieEntity, Integer>{
	

}
