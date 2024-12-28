package com.practice.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.practice.pageobjects.LoginPage;

public class Base {

	protected WebDriver driver;
	public LoginPage loginpage;

//	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void invokeDriver() {
		
		
//		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		
//		driver.get("https://the-internet.herokuapp.com/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	public void closeDriver() {
		driver.close();
	}
}
