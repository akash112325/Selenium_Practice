package com.learning_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_utilities.Base_test;

public class Base_Class_Test extends Base_test {
	@Test
	public void baseClassTest() {
		Reporter.log("Base test is running fine",true);
	}

}
