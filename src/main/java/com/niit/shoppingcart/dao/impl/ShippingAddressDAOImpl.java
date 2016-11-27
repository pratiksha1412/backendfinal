package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.ShippingAddressDAO;
import com.niit.shoppingcart.model.ShippingAddress;

@Repository("shippingAddressDAO")
public class ShippingAddressDAOImpl implements ShippingAddressDAO{
	
	//private static final Logger Logger = LoggerFactory.getLogger(ShippingAddressDAOImpl.class);
	
	public ShippingAddressDAOImpl()
	{
		
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ShippingAddressDAOImpl(SessionFactory sessionFactory)
	{
		
			this.sessionFactory=sessionFactory;
		
	}

	@Transactional
	public boolean save(ShippingAddress shippingAddress) {
		
	try{
		/*
		if(get(shippingAddress.getId())!=null)
		{
			return false;
		}*/
		
		sessionFactory.getCurrentSession().save(shippingAddress);
		
		return true;
		
	}
	
	catch (Exception e){
		
		e.printStackTrace();
		
		return false;
		
		
	}
	
	
}
	
	
	@Transactional
	
	public boolean update(ShippingAddress shippingAddress) {
		
		try{
			if(get(shippingAddress.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().update(shippingAddress);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
		
	}
	
	@Transactional

	public ShippingAddress get(String id) {
		
		return(ShippingAddress) sessionFactory.openSession().get(ShippingAddress.class,id);
	}
	
	
	@Transactional
	public boolean delete(ShippingAddress shippingAddress) {
		
		try{
			/*if(get(shippingAddress.getId())!=null)
			{
				return false;
			}*/
			
			sessionFactory.openSession().delete(shippingAddress);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}

	public List<ShippingAddress> list() {
		return null;
		
		/*String hql="from shippingAddress";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();*/
		
		
	}

}





