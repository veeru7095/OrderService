package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Service.OrderService;
import com.example.demo.payload.OrderRequestDto;
import com.example.demo.payload.OrderResponseDto;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@Autowired
	private final OrderService orderServcie;
	
	public OrderController(OrderService orderService) {
		this.orderServcie=orderService;
	}
	
	@PostMapping("/createOrder")
	public OrderRequestDto createOrder(@RequestBody OrderRequestDto dto) {
		return orderServcie.createOrder(dto);
	}
	
	@GetMapping("/getOrder/{id}")
	public OrderEntity getOrder(@PathVariable Long id) {
		return orderServcie.getOrderById(id);
	}
	
	@GetMapping("/getInfo/{id}")
	public OrderResponseDto getinfo(@PathVariable Long id) {
		return orderServcie.getInfo(id);
	}
	
}
