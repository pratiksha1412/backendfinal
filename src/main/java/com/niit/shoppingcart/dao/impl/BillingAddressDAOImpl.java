package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.BillingAddressDAO;
import com.niit.shoppingcart.model.BillingAddress;
@Repository("billingAddressDAO")
public class BillingAddressDAOImpl implements BillingAddressDAO{

	//private static final Logger Logger = LoggerFactory.getLogger(BillingAddressDAOImpl.class);
	
			public BillingAddressDAOImpl()
			{
				
			}
			
			@Autowired
			private SessionFactory sessionFactory;
			
			public BillingAddressDAOImpl(SessionFactory sessionFactory)
			{
				
					this.sessionFactory=sessionFactory;
				
			}

			@Transactional
			public boolean save(BillingAddress billingAddress) {
				
			try{
				/*
				if(get(billingAddress.getId())!=null)
				{
					return false;
				}*/
				
				sessionFactory.getCurrentSession().save(billingAddress);
				
				return true;
				
			}
			
			catch (Exception e){
				
				e.printStackTrace();
				
				return false;
				
				
			}
			
			
		}
			
			
			@Transactional
			
			public boolean update(BillingAddress billingAddress) {
				
				try{
					if(get(billingAddress.getId())!=null)
					{
						return false;
					}
					
					sessionFactory.openSession().update(billingAddress);
					
					return true;
					
				}
				
				catch (Exception e){
					
					e.printStackTrace();
					
					return false;
					
				}
				
				
			}
			
			@Transactional

			public BillingAddress get(String id) {
				
				return(BillingAddress) sessionFactory.openSession().get(BillingAddress.class,id);
			}
			
			
			@Transactional
			public boolean delete(BillingAddress billingAddress) {
				
				try{
					/*if(get(billingAddress.getId())!=null)
					{
						return false;
					}*/
					
					sessionFactory.openSession().delete(billingAddress);
					
					return true;
					
				}
				
				catch (Exception e){
					
					e.printStackTrace();
					
					return false;
					
				}
				
			}

			public List<BillingAddress> list() {
				return null;
				
				/*String hql="from billingAddress";
				
				Query query=sessionFactory.getCurrentSession().createQuery(hql);
				
				return query.list();*/
				
				
			}

	}



