package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.model.Product;
@Component
public class ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void getProductDetails() {
		String sql="select * from test.product";
		
		List<Product> p=jdbcTemplate.query(sql, new ProductRowMapper());
		System.out.println("---------------p-------------"+p);
	}
}
