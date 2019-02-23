package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsTest 
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();//ok 
		//al.dismiss();//cancel
		//al.getText();//text
		//al.sendKeys("VasuDeva");//enter data

	}

}
