package com.training.sdetday7;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class useDataFromTestNG {

	String Pet;
	
	@BeforeClass
	@org.testng.annotations.Parameters(value={"pet","browser","version","platform"})
	public void setUP(String pet,String browser,String version,String platform) throws Exception{
		Pet =pet;
	}
	
	@Test(priority=0)
	public void tc_useDataFromTestNG(){
		System.out.println("This is coming from TestNG"+Pet);
	}
}
