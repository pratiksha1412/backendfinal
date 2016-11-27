package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.BillingAddress;

public interface BillingAddressDAO {
	
public boolean save(BillingAddress billingAddress);
	
	public boolean update(BillingAddress billingAddress);
	
	public BillingAddress get(String id);
	
	public boolean delete(BillingAddress billingAddress);
	
	
	public List<BillingAddress> list();

	

}
