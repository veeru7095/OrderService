package com.example.demo.payload;

public class OrderRequestDto {

	private Long id;
	
	private Long productId;
	
	private String productName;
	
	private double price;
	
	private Long userId;

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public OrderRequestDto(Long id, Long productId, String productName, double price, Long userId) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.userId = userId;
	}

	public OrderRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
