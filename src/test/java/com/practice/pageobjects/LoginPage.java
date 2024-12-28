package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.Base.Base;

public class LoginPage extends Base {
	WebDriver driver;
	
	
	@FindBy(id = "username")
	WebElement usernamefield;
	
	@FindBy(id = "password")
	WebElement passwordfield;
	
	@FindBy(xpath = "//button//i[text()=' Login']")
	WebElement submitBtn;
	
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void launch(String url) {
		driver.get(url);
	}

	public void enterUsername(String username) {
		usernamefield.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordfield.sendKeys(password);
	}

	public void clickSubmit() {
		submitBtn.click();
	}
	
}
