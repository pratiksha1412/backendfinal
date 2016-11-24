/*package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;

public class CartTestCase {

	


	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static Cart cart;
	
	
	@Autowired
	static CartDAO cartDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 cartDAO  = (CartDAO) context.getBean("cartDAO");
		 
		 cart  = (Cart) context.getBean("cart");
		 
		 System.out.println("The object is created");
	 }

	@Test
	public void createCartTestCase()
	{
		cart.setId("6");
		
		
		
		cart.setPrice("1000");
		
		cart.setQuantity("5");
		
		cart.setProduct_id("1");
		
		
		
		Boolean status = cartDAO.save(cart);
		
		Assert.assertEquals("createCartTestcase", true, status);
	}
	
	
	
	

	@Test
	public void deleteCartTestCase()
	{
		cart.setId("1");
		boolean status = cartDAO.delete(cart);
		
		Assert.assertEquals("delete Cart Test case",true, status);
	}

	@Test
	public void deleteCartTestCase()
	{
		cart.setId("2");
		Boolean status= cartDAO.delete(cart);
		Assert.assertEquals("Delete Cart Test Case",true, status);
	}
	
	
	@Test
	public void updateCartTestCase()
	{
		
		
		cart.setId("3");
		Boolean status= cartDAO.update(cart);
		cart.setDescription("this is footware Cart");
		//Boolean status = cart.update(cart);
		Assert.assertEquals("update Cart Test Case",true, status);
	}
	
	
	@Test
	public void getCartTestCase()
	{
		

		Assert.assertEquals("Delete Cart Test Case",null, cartDAO.get("mod-07"));
		
	}
	
    @Test
	public void getAllCartTestCase()
	{
		Assert.assertEquals("get all test cases ",3,cartDAO.list().size());
	}
	



}


*/