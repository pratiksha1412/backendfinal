package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.ShippingAddress;

public interface ShippingAddressDAO {
	
public boolean save(ShippingAddress shippingAddress);
	
	public boolean update(ShippingAddress shippingAddress);
	
	public ShippingAddress get(String id);
	
	public boolean delete(ShippingAddress shippingAddress);
	
	
	public List<ShippingAddress> list();

	

}
