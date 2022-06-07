package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product{
	@Id
	private Integer productid;
	@Column(name = "productname")
	private String productname;
	@Column(name = "prize")
	private String prize;
	@Column(name = "review")
	private String review;

}
