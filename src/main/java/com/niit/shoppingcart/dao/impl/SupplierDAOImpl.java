/*package com.niit.shoppingcart.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;


public class SupplierDAOImpl implements SupplierDAO{
	
	//private static final Logger Logger = LoggerFactory.getLogger(SupplierDAOImpl.class);
	
			public SupplierDAOImpl()
			{
				
			}
			
			@Autowired
			private SessionFactory sessionFactory;
			
			public SupplierDAOImpl(SessionFactory sessionFactory)
			{
				
					this.sessionFactory=sessionFactory;
				
			}

			@Transactional
			public boolean save(Supplier supplier) {
				
			try{
				
				if(get(supplier.getId())!=null)
				{
					return false;
				}
				
				sessionFactory.getCurrentSession().save(supplier);
				
				return true;
				
			}
			
			catch (Exception e){
				
				e.printStackTrace();
				
				return false;
				
				
			}
			
			
		}
			
			
			@Transactional
			
			public boolean update(Supplier supplier) {
				
				try{
					if(get(supplier.getId())!=null)
					{
						return false;
					}
					
					sessionFactory.openSession().update(supplier);
					
					return true;
					
				}
				
				catch (Exception e){
					
					e.printStackTrace();
					
					return false;
					
				}
				
				
			}
			
			@Transactional

			public Supplier get(String id) {
				
				return(Supplier) sessionFactory.openSession().get(Supplier.class,id);
			}
			
			
			@Transactional
			public boolean delete(Supplier supplier) {
				
				try{
					if(get(supplier.getId())!=null)
					{
						return false;
					}
					
					sessionFactory.openSession().delete(supplier);
					
					return true;
					
				}
				
				catch (Exception e){
					
					e.printStackTrace();
					
					return false;
					
				}
				
			}

			public List<Supplier> list() {
				return null;
				
				String hql="from supplier";
				
				Query query=sessionFactory.getCurrentSession().createQuery(hql);
				
				return query.list();
				
				
			}

			public Supplier get(Supplier id) {
				// TODO Auto-generated method stub
				return null;
			}

	}


*/