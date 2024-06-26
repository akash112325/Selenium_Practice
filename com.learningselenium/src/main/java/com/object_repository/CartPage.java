package com.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@value='Subscribe']")
	private WebElement subscribeButton;

	public WebElement getSubscribeButton() {
		return subscribeButton;
	} 
}
