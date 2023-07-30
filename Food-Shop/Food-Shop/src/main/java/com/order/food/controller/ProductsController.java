package com.order.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.food.dto.ProductsDTO;
import com.order.food.entity.Products;
import com.order.food.service.IProductsService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private IProductsService service; 
	
	@PostMapping("/add-product")
	public String addProducts(@RequestBody ProductsDTO dto) {
		return service.addProducts(dto);
	}
	
	@GetMapping("/getAll")
    public List<Products> getAllProducts(){
		return service.getAllProducts();
    	
    }
	
	@PutMapping("/updateProduct")
	public String updateProducts(@RequestBody ProductsDTO dto) {
		return service.updateProducts(dto);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProducts(@PathVariable long id) {
		return service.deleteProducts(id);
	}
	
	@GetMapping("get-product/{id}")
	public Products getProductById(@PathVariable long id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/get-sorted-product")
	public List<Products> getSortedProduct(){
		return service.getSortedProduct();
	}
 
}
