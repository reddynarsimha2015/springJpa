package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.example.demo.model.Product;
@Component
public interface ProductRepository extends JpaRepository<Product, Integer>{
public Product  findByProductid(Integer productid);
public Product findByProductidAndProductname(Integer productId,String productName);
//public Product findByProductidAndProductname(Integer productId,String productname);4
@Query("UPDATE  Product  prod SET prod.productname=:productname WHERE prod.productid=:productid ")
@Modifying
@Transactional
public void setProductname(@Param("productid") Integer productid,@Param("productname") String productNSame);

}
