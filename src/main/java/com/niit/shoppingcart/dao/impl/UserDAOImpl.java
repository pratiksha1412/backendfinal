/*package com.niit.shoppingcart.dao.impl;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

	public boolean save(User user) {
	
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

	public boolean update(User user) {
		
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
	}

	public User get(String id) {
		return(User) sessionFactory.openSession().get(User.class,id);
		
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
	return null;
		String hql="from user";
	Query query=sessionFactory.getCurrentSession().createQuery();
		
		return query.list();
		
		}

}
*/