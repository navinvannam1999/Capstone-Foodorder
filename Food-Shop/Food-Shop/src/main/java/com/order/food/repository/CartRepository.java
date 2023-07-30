package com.order.food.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.food.entity.Cart;


public interface CartRepository extends JpaRepository<Cart, Long> {
	
	List<Cart> findAllByUserId(Long id);
}
