package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.PaymentMethodDAO;
import com.niit.shoppingcart.model.PaymentMethod;

public class PaymentMethodDAOImpl implements PaymentMethodDAO{

	//private static final Logger Logger = LoggerFactory.getLogger(PaymentMethodDAOImpl.class);
	
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void PaymentMethodDAOImpl(SessionFactory sessionFactory)
	{
		
			this.sessionFactory=sessionFactory;
		
	}

	@Transactional
	public boolean save(PaymentMethod paymentMethod) {
		
	try{
		/*
		if(get(paymentMethod.getId())!=null)
		{
			return false;
		}*/
		
		sessionFactory.getCurrentSession().save(paymentMethod);
		
		return true;
		
	}
	
	catch (Exception e){
		
		e.printStackTrace();
		
		return false;
		
		
	}
	
	
}
	
	
	@Transactional
	
	public boolean update(PaymentMethod paymentMethod) {
		
		try{
			if(get(paymentMethod.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().update(paymentMethod);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
		
	}
	
	@Transactional

	public PaymentMethod get(String id) {
		
		return(PaymentMethod) sessionFactory.openSession().get(PaymentMethod.class,id);
	}
	
	
	@Transactional
	public boolean delete(PaymentMethod paymentMethod) {
		
		try{
			/*if(get(paymentMethod.getId())!=null)
			{
				return false;
			}*/
			
			sessionFactory.openSession().delete(paymentMethod);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}

	public List<PaymentMethod> list() {
		return null;
		
		/*String hql="from paymentMethod";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();*/
		
		
	}

}



