package com.training.sdetday6;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNGnew {

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeclass");
	  }
	  
	 
	@Test(priority=0)
	void login(){
		System.out.println("login");
	}
	
	@Test(priority=1)
	void search(){
		System.out.println("search");
	}
	
	@Test(priority=2)
	void addcart(){
		
		System.out.println("add to cart");
		
	}
	
	@Test(priority=3)
	void payment(){
		System.out.println("Payment done");
	}
	
	 @AfterClass
	  public void afterClass() {
		  System.out.println("afterclass");
	  }
	
	
	
}
