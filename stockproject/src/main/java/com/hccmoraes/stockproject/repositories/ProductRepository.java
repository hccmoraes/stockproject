package com.hccmoraes.stockproject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hccmoraes.stockproject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
