package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;


public interface SupplierDAO {
	
//public boolean save(Supplier supplier);
	
	//public boolean update(Supplier supplier);
	
	public Supplier get(Supplier id);
	
	public boolean delete(String string);
	
	
	public List<Supplier> list();

	public boolean saveOrUpdate(Supplier supplier);

	public Supplier get(String string);


}
