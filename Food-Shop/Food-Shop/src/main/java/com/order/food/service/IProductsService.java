package com.order.food.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.order.food.dto.ProductsDTO;
import com.order.food.entity.Products;

public interface IProductsService {
	
   public String addProducts(ProductsDTO productDto);
	
	public List<Products> getAllProducts();
	
	public String updateProducts(ProductsDTO productDto);
	
	public String deleteProducts(long id);
	
	public Products getProductById(long id);
	
//	public void saveMultiple(MultipartFile file);	
	
	public List<Products> getSortedProduct();

}
