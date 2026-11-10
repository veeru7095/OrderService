package com.example.demo.cilent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.payload.UserResponseDto;

@FeignClient(name ="USERSERVICE")
public interface UserCilent {
	
	@GetMapping("/api/auth/getUser/{id}")
	UserResponseDto getUserById(@PathVariable("id") Long id);

}
