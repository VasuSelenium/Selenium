package com.vasu.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
@FindBy(id="txtuId")
WebElement userName;//page object
@FindBy(id="txtPword")
WebElement password;//page object
@FindBy(id="login")
WebElement login;//page object
//method
public void adminLogin()
{
	userName.sendKeys("Admin");
	password.sendKeys("Admin");
	login.click();
}
}
