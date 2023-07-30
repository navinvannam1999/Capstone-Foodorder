package com.order.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.order.food.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
