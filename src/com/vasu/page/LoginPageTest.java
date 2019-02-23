package com.vasu.page;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Primusbank.qedgetech.com");
		driver.manage().window().maximize();
		
		LoginPage app=PageFactory.initElements(driver, LoginPage.class);
		app.adminLogin();
		BranchCreationPage app1=PageFactory.initElements(driver, BranchCreationPage.class);
		//app1.b

	}

}
