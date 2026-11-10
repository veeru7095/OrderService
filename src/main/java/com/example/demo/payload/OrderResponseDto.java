package com.example.demo.payload;

public class OrderResponseDto {
	
	private Long id;
	
	private Long productId;
	
	private String productName;
	
	private double price;
	
	private UserResponseDto user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public UserResponseDto getUser() {
		return user;
	}

	public void setUser(UserResponseDto user) {
		this.user = user;
	}

	public OrderResponseDto(Long id, Long productId, String productName, double price, UserResponseDto user) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.user = user;
	}

	public OrderResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
