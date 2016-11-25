package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {


	public ProductDAOImpl()
	{
		
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		
			this.sessionFactory=sessionFactory;
		
	}

	@Transactional
	public boolean save(Product product) {
		
	try{
		
		/*if(get(product.getId())!=null)
		{
			return false;
		}*/
		
		sessionFactory.getCurrentSession().save(product);
		
		return true;
		
	}
	
	catch (Exception e){
		
		e.printStackTrace();
		
		return false;
		
		
	}
	
	
}
	
	
	@Transactional
	
	public boolean update(Product product) {
		
		try{
			if(get(product.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().update(product);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
		
	}
	
	@Transactional

	public Product get(String id) {
		
		return(Product) sessionFactory.openSession().get(Product.class,id);
	}
	
	
	@Transactional
	public boolean delete(Product product) {
		
		try{
			if(get(product.getId())!=null)
			{
				return false;
			}
			
			sessionFactory.openSession().delete(product);
			
			return true;
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}

	public List<Product> list() {
		return null;
		
		/*String hql="from product";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		*/
		
	}

}


