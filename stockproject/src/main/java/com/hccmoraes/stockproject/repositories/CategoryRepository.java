package com.hccmoraes.stockproject.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hccmoraes.stockproject.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}