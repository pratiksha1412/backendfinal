/*package com.niit.shoppingorder.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.OrderDAO;
import com.niit.shoppingorder.model.Order;

public class OrderDAOImpl implements OrderDAO{


	public OrderDAOImpl()
	{
		
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public OrderDAOImpl(SessionFactory sessionFactory)
	{
		
			this.sessionFactory=sessionFactory;
		
	}

	@Transactional
	public boolean save(Order order) {
		
	try{
		
		if(get(order.getId())!=null)
		{
			return false;
		}
		
		sessionFactory.getCurrentSession().save(order);
		
		return true;
		
	}
	
	catch (Exception e){
		
		e.printStackTrace();
		
		return false;
		
		
	}
	
	
}
	
	
	@Transactional
	
	public boolean update(Order order) {
		
		try{
			if(get(order.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().update(order);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
		
	}
	
	@Transactional

	public Order get(String id) {
		
		return(Order) sessionFactory.openSession().get(Order.class,id);
	}
	
	
	@Transactional
	public boolean delete(Order order) {
		
		try{
			if(get(order.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().delete(order);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}

	public List<Order> list() {
		return null;
		
		String hql="from order";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
		
	}

}





*/