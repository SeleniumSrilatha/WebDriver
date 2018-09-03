package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest
{
	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://Google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(),'Ima')]")).click();
		
	}

}
