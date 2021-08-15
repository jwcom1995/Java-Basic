package com.model.dto;

public class Product {
	
	private String p_name;
	private String product_id;
	private String description;
	private int stock;
	private int price;
	
	public Product() {}

	public Product(String p_name, String product_id, String description, int stock, int price) {
		super();
		this.p_name = p_name;
		this.product_id = product_id;
		this.description = description;
		this.stock = stock;
		this.price = price;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [제품 아이디 : " + product_id + ", 제품명 : " + p_name + ", 가격 : " + price +", 제품설명 : " + description + ", 재고량 : "
				+ stock +  "]";
	}
	
	
}
