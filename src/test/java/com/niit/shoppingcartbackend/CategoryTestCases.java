package com.niit.shoppingcartbackend;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTestCases {
	
	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	
	@Autowired
	static Category category;
	
	
	@Autowired
	static CategoryDAO categoryDAO;


	
	
	@BeforeClass
	 public static void inti()
	 {
		 context =  new  AnnotationConfigApplicationContext();
		 context.scan("com.niit");
		 context.refresh();
		 
		 categoryDAO  = (CategoryDAO) context.getBean("categoryDAO");
		 
		 category  = (Category) context.getBean("category");
		 
		 System.out.println("The object is created");
	 }
 
	@Test
	public void createCategoryTestCase()
	{
		category.setId("2");
		
		category.setName("men");
		
		Boolean status = categoryDAO.save(category);
		
		Assert.assertEquals("createCategoryTestcase", true, status);
	}
	
	
	
	

	@Test
	public void deleteCategoryTestcase()
	{
		category.setId("1");
		boolean status = categoryDAO.delete(category);
		
		Assert.assertEquals("deleteCategoryTestcase",true, status);
	}

	@Test
	public void deleteCategoryTestCase()
	{
		category.setId("2");
		Boolean status= categoryDAO.delete(category);
		Assert.assertEquals("DeleteCategoryTestCase",true, status);
	}
	
	
	@Test
	public void updateCategoryTestCase()
	{
		
		
		category.setId("1");
		Boolean status= categoryDAO.update(category);
		category.setName("this is footware Category");
		//Boolean status = category.update(category);
		Assert.assertEquals("update Category Test Case",true, status);
	}
	
	
	@Test
	public void getCategoryTestCase()
	{
		

		Assert.assertEquals("Delete Category Test Case",null, categoryDAO.get("2"));
		
	}
	
     @Test
	public void getAllCategoryTestCase()
	{
		Assert.assertEquals("get all test cases ",6,categoryDAO.list().size());
	}
	



}
