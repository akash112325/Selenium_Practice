package com.learning_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_DependsOnMethods {


	@Test(dependsOnMethods = {"register"})
	public void login()
	{
		Reporter.log("executing login test",true);
	}
	
	@Test()
	public void register()
	{
		Reporter.log("executing register test case ", true);
	}
	
	@Test(dependsOnMethods = {"register","login"})
	public void addToCartTest()
	{
		Reporter.log("executing addToCartTest case", true);
	}
}
