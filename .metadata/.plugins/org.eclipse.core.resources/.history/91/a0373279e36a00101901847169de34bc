package com.hccmoraes.stockproject.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hccmoraes.stockproject.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = new ArrayList<>();
		list.add(new Product (1L, "TV", "Un", null));
		list.add(new Product (2L, "Agenda", "Un", null));
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product prod = new Product (1L, "TV", "Un", null);
		return ResponseEntity.ok().body(prod);
	}

}
