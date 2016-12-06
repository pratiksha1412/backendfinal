package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table(name="cart")
public class Cart {
	@Id
	@Column
	public long id;
	public String product_id;
	public String quantity;
	public String price;
	public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setStatus(char c) {
		// TODO Auto-generated method stub
		
	}

}
