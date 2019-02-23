package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest 
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		
		//row
		List<WebElement> row=driver.findElements(By.xpath(".//*[@id='customers']/tbody/tr"));
		System.out.println(row.size());
		//col
		for (int i = 0; i < row.size(); i++) 
		{
			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
			//System.out.println(col.size());
			//for (int j = 0; j <col.size(); j++) 
			//{
				System.out.println(col.get(2).getText());
			//}
		}
		

	}

}
