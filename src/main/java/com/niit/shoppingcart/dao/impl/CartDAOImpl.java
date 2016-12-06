package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.Query;
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

	public Cart get(long l) {
		
		return(Cart) sessionFactory.openSession().get(Cart.class,l);
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
		
		String hql="from cart";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
		
	}

	public List<Cart> list(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getTotalAmount(String loggedInUserid) {
		return(Cart) sessionFactory.openSession().get(Cart.class,loggedInUserid);
		
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	public Cart get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}




