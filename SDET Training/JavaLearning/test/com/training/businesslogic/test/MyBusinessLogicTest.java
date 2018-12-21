package com.training.businesslogic.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.businesslogic.MyBusinessLogic;

public class MyBusinessLogicTest {
	
	MyBusinessLogic mb1 = null;
	
	@BeforeClass
	public static void SetUpBeforeClass(){
		System.out.println("Hi i'm in before class, and only once");
	}

	@Before
	public void setup(){
      mb1 = new MyBusinessLogic();
		
	}
	
	@After
	  public void tearDown(){
		System.out.println("i am in after");
	}
	//Can't have return type
   @Test(timeout=500)
   public void insertRecordTest() throws InterruptedException{
	   MyBusinessLogic mb1 = new MyBusinessLogic();
	   int retVal  = mb1.insertRecord(101,"Harry");
	   Thread.sleep(450);
	   assertEquals(1,retVal);   
	   
   }
   
   @Test (expected=RuntimeException.class)
   public void sayHelloTest(){
	   MyBusinessLogic mb1 = new MyBusinessLogic();
	   String name = "vimala";
	   String retVal = "Hello" + name;
	   
	   assertEquals(retVal,mb1.sayHello(name));
   }


}
