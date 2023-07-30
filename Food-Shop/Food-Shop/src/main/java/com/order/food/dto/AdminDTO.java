package com.order.food.dto;

import javax.persistence.Entity;

public class AdminDTO {
	
	private long id;
	private String email;
	private String password;
	
	public AdminDTO() {
		
	}

	public AdminDTO(long id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminDTO [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
