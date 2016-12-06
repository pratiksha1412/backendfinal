package com.niit.shoppingcart.dao.impl;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;
@Repository("userDAO")
public class UserDAOImpl implements UserDAO{
	
	public UserDAOImpl ()
	{
		
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		
			this.sessionFactory=sessionFactory;
		
	}

public Boolean save(User user) {
	
		try {
			if(get(user.getId())!= null)
			{
			return false;
			}
              sessionFactory.getCurrentSession().save(user);
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
		}
	}

	/*public boolean update(User user) {
		
		try {
			
			if(get(user.getId())!=null)
			{
			return false;
			}
			
            sessionFactory.getCurrentSession().update(user);
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}*/
@Transactional
	public User get(String id) {
		/*return(User) sessionFactory.openSession().get(User.class,id);*/
		String hql="from user where id="+"'"+id+"'";
		return getUserDetails(hql);
	}

	public boolean delete(User user) {
		
		try {
			if(get(user.getId())==null)
			{
			return true;
			}
			sessionFactory.getCurrentSession().delete(user);
			return false;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		}
	}

	public List<User> list() {
	
		String hql="from user";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	
	return query.list();
	
		}

	
	@Transactional
	public User isvalidUser(String userID, String password) {
		String hql="from User where id = "  +  "'"  + "and" +"password = " + "'" + password + "'";
	return getUserDetails(hql);
		
	}

	private User getUserDetails(String id) {
		
		String hql="from user";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<User> list =(List<User>) query.list();
		/*if(list !=null && !list.isEmpty())
		{
			
		}*/return (User) query.list();
		
		
		
	}

	public void saveOrUpdate(User user) {
	
	}

	
	
}
