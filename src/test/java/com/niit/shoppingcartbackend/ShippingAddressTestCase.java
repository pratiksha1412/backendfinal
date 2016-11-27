package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ShippingAddressDAO;
import com.niit.shoppingcart.model.ShippingAddress;

public class ShippingAddressTestCase {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static ShippingAddress shippingAddress;
	
	
	@Autowired
	static ShippingAddressDAO shippingAddressDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 shippingAddressDAO  = (ShippingAddressDAO) context.getBean("shippingAddressDAO");
		 
		 shippingAddress  = (ShippingAddress) context.getBean("shippingAddress");
		 
		 System.out.println("The object is created");
	 }

	@Test
	public void createShippingAddressTestCase()
	{
		shippingAddress.setId("3");
		
		shippingAddress.setHouseno("7");
		
		shippingAddress.setStreet("pratap");
		shippingAddress.setCity("tuljapur");
		shippingAddress.setCountry("India");
		Boolean status = shippingAddressDAO.save(shippingAddress);
		
		Assert.assertEquals("createShippingAddressTestcase", true, status);
	}
	
	
	
	
/*
	@Test
	public void deleteShippingAddressTestcase()
	{
		shippingAddress.setId("1");
		boolean status = shippingAddressDAO.delete(shippingAddress);
		
		Assert.assertEquals("deleteShippingAddressTestcase",true, status);
	}

	
	
	
	@Test
	public void updateShippingAddressTestCase()
	{
		
		
		shippingAddress.setId("1");
		Boolean status= shippingAddressDAO.update(shippingAddress);
		shippingAddress.setHouseno("4");
		shippingAddress.setCity("chinchwad");
		shippingAddress.setStreet("deccan");
		shippingAddress.setCountry("India");
		//Boolean status = shippingAddress.update(shippingAddress);
		Assert.assertEquals("update ShippingAddress Test Case",true, status);
	}
	
	
	@Test
	public void getShippingAddressTestCase()
	{
		

		Assert.assertEquals("Delete ShippingAddress Test Case",null, shippingAddressDAO.get("2"));
		
	}
	
   @Test
	public void getAllShippingAddressTestCase()
	{
		Assert.assertEquals("get all test cases ",6,shippingAddressDAO.list().size());
	}
	

*/

}


