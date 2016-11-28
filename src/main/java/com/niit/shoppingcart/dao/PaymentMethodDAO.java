package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.PaymentMethod;

public interface PaymentMethodDAO {
	
public boolean save(PaymentMethod paymentMethod);
	
	public boolean update(PaymentMethod paymentMethod);
	
	public PaymentMethod get(String id);
	
	public boolean delete(PaymentMethod paymentMethod);
	
	
	public List<PaymentMethod> list();

}

