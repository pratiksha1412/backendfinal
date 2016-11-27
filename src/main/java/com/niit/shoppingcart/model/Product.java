package com.niit.shoppingcart.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table(name="product")
public class Product {
	@Id
	@Column
	public String id;
	public String name;
	public String price;
	public String stock;
	public String category_id;
	public String supplier_id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	
	
	@ManyToOne       /*(mappedBy="product",fetch=FetchType.EAGER)*/
	@JoinColumn(name="category_id",updatable=false,insertable=false,nullable=false)
	
	private Category category;
	public Set<Category> getCategory() {
		return (Set<Category>) category;
	}
	public void setCategory(Set<Category>category) {
		this.category = (Category) category;
	}
	

}
