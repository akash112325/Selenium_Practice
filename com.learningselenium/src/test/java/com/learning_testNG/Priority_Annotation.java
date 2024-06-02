package com.learning_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Annotation {
	
	@Test(priority = -1)
	public void login()
	{
		Reporter.log("executing login test priority -1",true);
	}
	
	@Test(priority = -2)
	public void register()
	{
		Reporter.log("executing register test case having priority - 2", true);
	}
	
	@Test(priority = 2)
	public void addToCartTest()
	{
		Reporter.log("executing addToCartTest case having priority 2", true);
	}

}
