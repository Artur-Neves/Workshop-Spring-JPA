package com.devJava.courseSpring1.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devJava.courseSpring1.entites.Product;
import com.devJava.courseSpring1.repositories.ProductRepository;


@Service
public class ProductService {
	@Autowired
	private ProductRepository ProductRepository;
	public List<Product> findAll(){
		return ProductRepository.findAll();
	}
	public Product findById(long id) {
		return  ProductRepository.findById(id).get();
	}
}
