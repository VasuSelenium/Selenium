package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://bing.com");
		driver.manage().window().maximize();
		
		WebElement header=driver.findElement(By.className("sw_tb"));
		
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
		for (WebElement element : headerLinks) 
		{
			//System.out.println(element.getText());
			if (!element.getText().isEmpty())
			{
				//System.out.println(element.getText());	
			}
		}
		

	}

}
