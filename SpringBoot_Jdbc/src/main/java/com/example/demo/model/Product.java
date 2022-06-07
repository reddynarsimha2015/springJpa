package com.example.demo.model;

public class Product {
private int id;
private String name;
private String prize;
private String review;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrize() {
	return prize;
}
public void setPrize(String prize) {
	this.prize = prize;
}
public String getReview() {
	return review;
}
public void setReview(String review) {
	this.review = review;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", prize=" + prize + ", review=" + review + "]";
}



}
