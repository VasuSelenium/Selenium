package com.vasu.practies;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws Exception 
	{//implicit
		/*int a=10;
		System.out.println(a);
		double d=a;
		System.out.println(d);
		
*/
		//explicit
		/*double d=20.78;
		System.out.println(d);
		int a=(int)d;
		System.out.println(a);*/
		
		/*FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot st=(TakesScreenshot)driver;
		File srcFile=st.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\vasu\\Desktop\\ScreenShotTest\\vasu.png"));*/
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://newtours.demoaut.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++)
		{
			String linkName=links.get(i).getText();
			links.get(i).click();
			TakesScreenshot st=(TakesScreenshot)driver;
			File srcFile=st.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\vasu\\Desktop\\ScreenShotTest\\"+linkName+".png"));
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
			
		}
		
	}

}
