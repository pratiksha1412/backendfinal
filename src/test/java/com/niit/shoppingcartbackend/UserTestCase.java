package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTestCase {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static User user;
	
	
	@Autowired
	static UserDAO userDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 userDAO  = (UserDAO) context.getBean("userDAO");
		 
		 user  = (User) context.getBean("user");
		 
		 System.out.println("The object is created");
	 }

	@Test
	public void createUserTestCase()
	{
		user.setId("i2");
		
		user.setName("ganpati12");
		user.setPassword("asaa2");
		user.setRole("producer3");
		user.setContact("pune4");
		
		
		Boolean status = userDAO.save(user);
		
		Assert.assertEquals("createUserTestcase", true, status);
	}
	
}
	
	
/*
	@Test
	public void deleteUserTestCase()
	{
		user.setId("1");
		boolean status = userDAO.delete(user);
		
		Assert.assertEquals("delete User Test case",true, status);
	}
}
*/