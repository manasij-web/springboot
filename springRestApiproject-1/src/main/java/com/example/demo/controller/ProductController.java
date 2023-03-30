package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	public ProductService ps;
	
	@GetMapping("/product")
	public List<Product> getProducts(){
		return this.ps.getProducts();
		
	}
	
	@PostMapping("/product/p")
	public Product addProduct(@Valid @RequestBody Product p1) {
		return this.ps.saveProduct(p1);
		
	}
	
	
	
	

}
