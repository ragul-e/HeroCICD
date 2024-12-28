package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SecurePage {

	WebDriver driver;
	
	public SecurePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
