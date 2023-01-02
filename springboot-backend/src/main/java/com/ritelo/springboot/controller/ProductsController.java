package com.ritelo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritelo.springboot.model.Products;
import com.ritelo.springboot.repository.ProductsRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/")
public class ProductsController {
	
	@Autowired
	private ProductsRepository productsRepository;
	
	
	@GetMapping("products")
	public List<Products> getProducts(){
		return this.productsRepository.findAll();
	}
}
