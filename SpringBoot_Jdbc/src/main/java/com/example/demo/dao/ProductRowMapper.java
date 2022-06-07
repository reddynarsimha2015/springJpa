package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Product;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setId(rs.getInt("Id"));
		product.setName(rs.getString("productName"));
		product.setPrize(rs.getString("prize"));
		product.setReview(rs.getString("review"));
		
		return product;
	}

}
