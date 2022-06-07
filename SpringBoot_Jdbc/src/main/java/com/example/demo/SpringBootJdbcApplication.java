package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.ProductDao;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		ProductDao product = context.getBean(ProductDao.class);
		product.getProductDetails();
	}

}
