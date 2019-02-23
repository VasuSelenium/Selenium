package com.vasu.practies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("Http://Gmail.com");
	}

}
