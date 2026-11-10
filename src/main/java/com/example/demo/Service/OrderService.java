package com.example.demo.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.cilent.UserCilent;
import com.example.demo.payload.OrderRequestDto;
import com.example.demo.payload.OrderResponseDto;
import com.example.demo.payload.UserResponseDto;

@Service
public class OrderService {

	
	@Autowired
	private final OrderRepository orderRepository;
	
	@Autowired
	private final ModelMapper modelMapper;
	
	@Autowired
	private final UserCilent uaerCilent;
	
	@Autowired
	private final RestTemplate restTemplate;

	public OrderService(OrderRepository orderRepository,ModelMapper modelMapper, RestTemplate restTemplate, UserCilent uaerCilent) {
		this.orderRepository=orderRepository;
		this.modelMapper=modelMapper;
		this.uaerCilent = uaerCilent;
		this.restTemplate = restTemplate;
	}
	
	public OrderRequestDto createOrder(OrderRequestDto dto) {
		OrderEntity order=modelMapper.map(dto, OrderEntity.class);
		OrderEntity savedOrder=orderRepository.save(order);
		return modelMapper.map(savedOrder, OrderRequestDto.class);
		
	}
	
	public OrderEntity getOrderById(Long id) {
		OrderEntity order=orderRepository.findById(id).orElseThrow(
				()-> new RuntimeException("Order Not Found By Id "+id));
		return order;
	}
	
	public OrderResponseDto getInfo(Long id) {
		
		OrderEntity order=orderRepository.findById(id).orElseThrow(
				()-> new RuntimeException("Order Not found By id "+id));

		
		Long userId=order.getUserId();
		
		UserResponseDto user = uaerCilent.getUserById(userId);
		
		OrderResponseDto orderResponse=new OrderResponseDto();
		orderResponse.setId(order.getId());
		orderResponse.setProductId(order.getProductId());
		orderResponse.setProductName(order.getProductName());
		orderResponse.setPrice(order.getPrice());
		orderResponse.setUser(user);
		
		return orderResponse;
		
	}
	
}
