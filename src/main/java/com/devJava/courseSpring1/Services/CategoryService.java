package com.devJava.courseSpring1.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devJava.courseSpring1.entites.Category;
import com.devJava.courseSpring1.repositories.CategoryRepository;


@Service
public class CategoryService {
	@Autowired
	private CategoryRepository CategoryRepository;
	public List<Category> findAll(){
		return CategoryRepository.findAll();
	}
	public Category findById(long id) {
		return  CategoryRepository.findById(id).get();
	}
}
