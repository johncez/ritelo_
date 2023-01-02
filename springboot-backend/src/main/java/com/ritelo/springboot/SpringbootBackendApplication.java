package com.ritelo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ritelo.springboot.model.Products;
import com.ritelo.springboot.repository.ProductsRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private ProductsRepository productsRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		this.productsRepository.save(new Products("Iphone 9","n/a","99"));
		this.productsRepository.save(new Products("Windows 9","n/a","32"));
		this.productsRepository.save(new Products("um cachorro","n/a","1"));
		this.productsRepository.save(new Products("botas do céu","n/a","3"));
		
	}

}
