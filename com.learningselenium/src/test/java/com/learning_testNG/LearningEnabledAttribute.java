package com.learning_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningEnabledAttribute {

	@Test(enabled = false)
	public void register()
	{
		Reporter.log("register test case");
	}
	
	@Test(enabled = true )
	public void login()
	{
		Reporter.log("executing login testcase");
	}
	
	@Test
	public void addToCart()
	{
		Reporter.log("executing addtocart testcase");
		
	}
}
