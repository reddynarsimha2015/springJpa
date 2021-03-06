package com.nt.configuration;





import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration

public class MultipleDataSourceConfiguration {
	
	@Bean
	@Primary
	@ConfigurationProperties("app.datasource.first")
	public DataSourceProperties firstDataSourceProperties() {
		
		return  new DataSourceProperties();
	}

	@Bean
	@Primary
	public javax.sql.DataSource firstDataSource() {
		return firstDataSourceProperties()
				.initializeDataSourceBuilder()
				.type( javax.sql.DataSource.class)
				.build();
	}

	@Bean
	public JdbcTemplate firstJdbcTemplate(@Qualifier("firstDataSource")DataSource ds ) {
		return new JdbcTemplate(ds);
	}
	
	
	@Bean
	@ConfigurationProperties("app.datasource.second")
	public DataSourceProperties secondDataSourceProperties() {
		
		return  new DataSourceProperties();
		// TODO Auto-generated method stub
		
	}

	@Bean
	public DataSource secondDataSource() {
		return secondDataSourceProperties()
				.initializeDataSourceBuilder()
				.type(DataSource.class).build();
	}

	@Bean
	public JdbcTemplate secondJdbcTemplate(@Qualifier("secondDataSource") DataSource ds) {
		return new JdbcTemplate(ds);
	}
	

}
