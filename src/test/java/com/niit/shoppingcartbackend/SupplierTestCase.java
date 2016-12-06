
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
		supplier.setId("3");
		
		supplier.setName("spark");
		supplier.setAddress("chinchwad");
		
		Boolean status = supplierDAO.saveOrUpdate(supplier);
		
		Assert.assertEquals("createSupplierTestcase", true, status);
	}
	
	
	
	

	@Test
	public void deleteSupplierTestCase()
	{
		supplier.setId("2");
		boolean status = supplierDAO.delete("supplier");
		
		Assert.assertEquals("deleteSupplierTestcase",true, status);
	}

	
	
	@Test
	public void updateSupplierTestCase()
	{
		
		
		supplier.setId("");
		Boolean status= supplierDAO.saveOrUpdate(supplier);
		supplier.setAddress("tuljapur");
		supplier.setName("latest");
		//Boolean status = supplier.update(supplier);
		Assert.assertEquals("update Supplier Test Case",true, status);
	}
	
	
	@Test
	public void getSupplierTestCase()
	{
		

		Assert.assertEquals("Delete Supplier Test Case",null, supplierDAO.get("Supplier"));
		
	}
	
     @Test
	public void getAllSupplierTestCase()
	{
		Assert.assertEquals("get all test cases ",3,supplierDAO.list().size());
	}
	



}

