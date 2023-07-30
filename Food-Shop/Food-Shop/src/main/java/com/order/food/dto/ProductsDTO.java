package com.order.food.dto;

import javax.persistence.Entity;

public class ProductsDTO {
	
	private long id;
	private String name;
	private double price;
	private String url;
	private String catagory;
	private int quantity;
	
	public ProductsDTO() {
		
	}

	public ProductsDTO(long id, String name, double price, String url, String catagory, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.url = url;
		this.catagory = catagory;
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductsDTO [id=" + id + ", name=" + name + ", price=" + price + ", url=" + url + ", catagory="
				+ catagory + ", quantity=" + quantity + "]";
	}
	
	
}
