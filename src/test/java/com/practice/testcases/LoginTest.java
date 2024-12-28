package com.practice.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.practice.Base.Base;
import com.practice.pageobjects.LoginPage;

public class LoginTest extends Base {
	
//	WebDriver driver;
	//a[text()='Elemental Selenium']
	
	
	@Test
	public void loginTest() {
//		
		loginpage = new LoginPage(driver);
		loginpage.launch("https://the-internet.herokuapp.com/login");
		loginpage.enterUsername("tomsmith");
		loginpage.enterPassword("SuperSecretPassword!");
		loginpage.clickSubmit();
		
	}
	
}

