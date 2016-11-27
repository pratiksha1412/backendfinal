package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.BillingAddressDAO;
import com.niit.shoppingcart.model.BillingAddress;

public class BillingAddressTestCase {

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static BillingAddress billingAddress;
	
	
	@Autowired
	static BillingAddressDAO billingAddressDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 billingAddressDAO  = (BillingAddressDAO) context.getBean("billingAddressDAO");
		 
		 billingAddress  = (BillingAddress) context.getBean("billingAddress");
		 
		 System.out.println("The object is created");
	 }

	@Test
	public void createBillingAddressTestCase()
	{
		billingAddress.setId("2");
		
		billingAddress.setHouseno("5");
		
		billingAddress.setStreet("prabhat");
		billingAddress.setCity("pune");
		billingAddress.setCountry("India");
		Boolean status = billingAddressDAO.save(billingAddress);
		
		Assert.assertEquals("createBillingAddressTestcase", true, status);
	}
	
	
	
	
/*
	@Test
	public void deleteBillingAddressTestcase()
	{
		billingAddress.setId("1");
		boolean status = billingAddressDAO.delete(billingAddress);
		
		Assert.assertEquals("deleteBillingAddressTestcase",true, status);
	}

	
	
	
	@Test
	public void updateBillingAddressTestCase()
	{
		
		
		billingAddress.setId("1");
		Boolean status= billingAddressDAO.update(billingAddress);
		billingAddress.setHouseno("4");
		billingAddress.setCity("chinchwad");
		billingAddress.setStreet("deccan");
		billingAddress.setCountry("India");
		//Boolean status = billingAddress.update(billingAddress);
		Assert.assertEquals("update BillingAddress Test Case",true, status);
	}
	
	
	@Test
	public void getBillingAddressTestCase()
	{
		

		Assert.assertEquals("Delete BillingAddress Test Case",null, billingAddressDAO.get("2"));
		
	}
	
    @Test
	public void getAllBillingAddressTestCase()
	{
		Assert.assertEquals("get all test cases ",6,billingAddressDAO.list().size());
	}
	

*/

}

