package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.User;

public interface UserDAO {
	
//public boolean save(User user);
	
//	public boolean update(User user);
	
	public User get(String id);
	
	public boolean delete(User user);
	
	
	public List<User> list();

	public User isvalidUser(String userID, String password);

	public void saveOrUpdate(User user);

	public Boolean save(User user);

	

}
