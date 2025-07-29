package com.hccmoraes.stockproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hccmoraes.stockproject.entities.Category;
import com.hccmoraes.stockproject.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
	@PostMapping
	public ResponseEntity<Category> insert(@RequestBody Category category) {
		Category saveCategory = categoryRepository.save(category);
		return ResponseEntity.ok().body(saveCategory);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		if (categoryRepository.existsById(id)) {
			categoryRepository.deleteById(id);
			return ResponseEntity.noContent().build(); // HTTP 204
		} else {
			return ResponseEntity.notFound().build(); // HTTP 404
		}
	
	}
}
