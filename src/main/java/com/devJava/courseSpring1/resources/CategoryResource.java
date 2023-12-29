package com.devJava.courseSpring1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devJava.courseSpring1.Services.CategoryService;
import com.devJava.courseSpring1.entites.Category;

@RestController	
@RequestMapping( "/categories")
public class CategoryResource {
    @Autowired	
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		list.stream().map(u -> u.toString()).forEach(System.out:: println);
	return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable long id) {	
		Category u = service.findById(id);
		return ResponseEntity.ok().body(u);
	}
	}
