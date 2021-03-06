package com.niit.shoppingcart.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="category")// if the table name is same as class name u no need to specify
@Component
public class Category {
	//these property name better to take same name as fields name in the category table
	@Id
	private String id;

@Column(name="name")
private String name;

/*private Set<Product> products;

@OneToMany(mappedBy="category",fetch = FetchType.EAGER )
public Set<Product> getProducts(){
	
	return products;
}*/


public String getId()
{
	return id;
}

public void setId(String id)
{
	
	this.id=id;
}

public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name=name;
}
/*
private Set<Product> products;

@OneToMany (mappedBy="category",fetch=FetchType.EAGER)
public Set<Product> getProducts()
{
	return products;
}

public void Setproducts(Set<Product>products)
{
	this.products=products;
}*/





}
