package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
	ProductRepository p = context.getBean(ProductRepository.class);
	Product prod = p.findByProductid(2);
	System.out.println(prod);
  Product p11 = p.findByProductidAndProductname(1, "soap");
System.out.println(p11);
p.setProductname(1, "laptop11");
	}

}
