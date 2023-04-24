package com.gomangoman.inventory;

public class ProductDTO {

	private String name;
	private int amount;
	private int price;
	
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(String name, int amount, int price) {
		super();
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "상품명 : " + name + ", 상품개수 : " + amount + ", 가격 : " + price;
	}
	
	
	
}
