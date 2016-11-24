/*
 
package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;


public class SupplierTestCase {

	

	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static Supplier supplier;
	
	
	@Autowired
	static SupplierDAO supplierDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 supplierDAO  = (SupplierDAO) context.getBean("supplierDAO");
		 
		 supplier  = (Supplier) context.getBean("supplier");
		 
		 System.out.println("The object is created");
	 }
 
	@Test
	public void createSupplierTestCase()
	{
		supplier.setId("1");
		
		supplier.setName("ganpati");
		
		Boolean status = supplierDAO.save(supplier);
		
		Assert.assertEquals("createSupplierTestcase", true, status);
	}
	
	
	
	

	@Test
	public void deleteSupplierTestCase()
	{
		supplier.setId("1");
		boolean status = supplierDAO.delete(supplier);
		
		Assert.assertEquals("delete Supplier Test case",true, status);
	}

	@Test
	public void deleteSupplierTestCase()
	{
		supplier.setId("2");
		Boolean status= supplierDAO.delete(supplier);
		Assert.assertEquals("Delete Supplier Test Case",true, status);
	}
	
	
	@Test
	public void updateSupplierTestCase()
	{
		
		
		supplier.setId("3");
		Boolean status= supplierDAO.update(supplier);
		supplier.setDescription("this is footware Supplier");
		//Boolean status = supplier.update(supplier);
		Assert.assertEquals("update Supplier Test Case",true, status);
	}
	
	
	@Test
	public void getSupplierTestCase()
	{
		

		Assert.assertEquals("Delete Supplier Test Case",null, supplierDAO.get("mod-07"));
		
	}
	
     @Test
	public void getAllSupplierTestCase()
	{
		Assert.assertEquals("get all test cases ",3,supplierDAO.list().size());
	}
	



}

*/