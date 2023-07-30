package com.order.food.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.order.food.dto.ProductsDTO;
import com.order.food.entity.Products;
import com.order.food.repository.ProductsRepository;
import com.order.food.service.IProductsService;

@Service
public class ProductsServiceImp implements IProductsService {
	
	@Autowired
	private ProductsRepository repo;
	
	@Override
    public String addProducts(ProductsDTO productDto) {
		Products product = new Products();
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		product.setUrl(productDto.getUrl());
		product.setCategory(productDto.getCatagory());
		product.setQuantity(productDto.getQuantity());
		
		repo.save(product);
		return "New Product Is Saved";
	}
	
	@Override
	public List<Products> getAllProducts(){
		return repo.findAll();	
	}
	
	@Override
	public String updateProducts(ProductsDTO productDto) {
		Products product = new Products();
		product.setId(productDto.getId());
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		product.setUrl(productDto.getUrl());
		product.setCategory(productDto.getCatagory());
		product.setQuantity(productDto.getQuantity());
		
		repo.save(product);
		return "Product is Updated";
	}
	
	@Override
	public String deleteProducts(long id) {
		
		repo.deleteById(id);
		return "Product is Deleted";
	}
	
	@Override
	public Products getProductById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Products> getSortedProduct(){
		return repo.findAll(Sort.by("category"));
		
	}


}
