package com.learning_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {

	@Test
	public void loginTest()
	{
		
		Reporter.log("Executing login test case"); // it will print in logs.
		Reporter.log("executing login test case", true);  // it will print in console and in Logs as well. 
	}
	
	@Test
	public void  register()
	{
		Reporter.log("executing register test case",true);
	}
	
	@Test
	public void  AddToCart()
	{
		Reporter.log("executing addToCart test case",true);
	}
}
