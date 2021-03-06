package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.configuration.MultipleDataSourceConfiguration;
import com.nt.dao.MultipleDataSourceDao;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MultipleDataSourceConfiguration.class})
public class SpringBootMultiDataConnectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont = SpringApplication.run(SpringBootMultiDataConnectionApplication.class, args);
		MultipleDataSourceDao dataSource = cont.getBean(MultipleDataSourceDao.class);
		System.out.println("-===========fist========="+dataSource.firstJdbcSoourceTest());
		System.out.println("-===========second========="+dataSource.secondJdbcSoourceTest());

	}

}
