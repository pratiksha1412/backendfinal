/*package com.niit.shoppingcartbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class ProductTestCase {


	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static Product product;
	
	
	@Autowired
	static ProductDAO productDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 productDAO  = (ProductDAO) context.getBean("productDAO");
		 
		 product  = (Product) context.getBean("product");
		 
		 System.out.println("The object is created");
	 }

	@Test
	public void createProductTestCase()
	{
		product.setId("6");
		
		product.setName("kolhapuri");
		
		product.setPrice("1000");
		
		product.setStock("5");
		
		product.setCategory_id("1");
		
		product.setSupplier_id("2");
		
		Boolean status = productDAO.save(product);
		
		Assert.assertEquals("createProductTestcase", true, status);
	}
	
	
	
	

	@Test
	public void deleteProductTestCase()
	{
		product.setId("1");
		boolean status = productDAO.delete(product);
		
		Assert.assertEquals("delete Product Test case",true, status);
	}

	@Test
	public void deleteProductTestCase()
	{
		product.setId("2");
		Boolean status= productDAO.delete(product);
		Assert.assertEquals("Delete Product Test Case",true, status);
	}
	
	
	@Test
	public void updateProductTestCase()
	{
		
		
		product.setId("3");
		Boolean status= productDAO.update(product);
		product.setDescription("this is footware Product");
		//Boolean status = product.update(product);
		Assert.assertEquals("update Product Test Case",true, status);
	}
	
	
	@Test
	public void getProductTestCase()
	{
		

		Assert.assertEquals("Delete Product Test Case",null, productDAO.get("mod-07"));
		
	}
	
    @Test
	public void getAllProductTestCase()
	{
		Assert.assertEquals("get all test cases ",3,productDAO.list().size());
	}
	



}

*/