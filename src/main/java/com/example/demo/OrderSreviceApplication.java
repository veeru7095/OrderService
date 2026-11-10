package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderSreviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderSreviceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
