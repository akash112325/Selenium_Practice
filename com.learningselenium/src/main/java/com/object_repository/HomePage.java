package com.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	private WebElement searchTF;
	
	@FindBy(xpath = "//input[@Value='Search']")
	private WebElement searchbutton;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

}
