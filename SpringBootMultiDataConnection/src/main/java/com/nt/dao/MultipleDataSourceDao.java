package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MultipleDataSourceDao {
    @Autowired
	JdbcTemplate firstJdbcTemplate;
    @Autowired
	JdbcTemplate secondJdbcTemplate;
    
    public int firstJdbcSoourceTest() {
    	return firstJdbcTemplate.queryForObject("select count(*)  FROM product", Integer.class);
    	
    }
    
    public int secondJdbcSoourceTest() {
    	return firstJdbcTemplate.queryForObject("select count(*)  FROM city", Integer.class);
    	
    }
	
}
