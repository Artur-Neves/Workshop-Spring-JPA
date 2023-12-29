package com.devJava.courseSpring1.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devJava.courseSpring1.entites.Order;
import com.devJava.courseSpring1.repositories.OrderRepository;


@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	public Order findById(long id) {
		return  orderRepository.findById(id).get();
	}
}
