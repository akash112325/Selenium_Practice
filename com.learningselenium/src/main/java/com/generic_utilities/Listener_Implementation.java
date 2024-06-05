package com.generic_utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listener_Implementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		TakesScreenshot ts = (TakesScreenshot) Base_test.sDriver;
		String base64SS = ts.getScreenshotAs(OutputType.BASE64);
		Base_test.test.addScreenCaptureFromBase64String(base64SS);
		Base_test.test.log(Status.FAIL, "Testcase fail and screenShot added...");
	}

}
