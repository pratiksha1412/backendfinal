/*package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;
@Repository("cartDAO")
public class CartDAOImpl implements CartDAO{

	public CartDAOImpl()
	{
		
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CartDAOImpl(SessionFactory sessionFactory)
	{
		
			this.sessionFactory=sessionFactory;
		
	}

	@Transactional
	public boolean save(Cart cart) {
		
	try{
		
		if(get(cart.getId())!=null)
		{
			return false;
		}
		
		sessionFactory.getCurrentSession().save(cart);
		
		return true;
		
	}
	
	catch (Exception e){
		
		e.printStackTrace();
		
		return false;
		
		
	}
	
	
}
	
	
	@Transactional
	
	public boolean update(Cart cart) {
		
		try{
			if(get(cart.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().update(cart);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
		
	}
	
	@Transactional

	public Cart get(String id) {
		
		return(Cart) sessionFactory.openSession().get(Cart.class,id);
	}
	
	
	@Transactional
	public boolean delete(Cart cart) {
		
		try{
			if(get(cart.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().delete(cart);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}

	public List<Cart> list() {
		return null;
		
		String hql="from cart";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
		
	}

}




*/