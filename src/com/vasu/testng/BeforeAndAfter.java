package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfter 
{
	public FirefoxDriver driver;
@BeforeTest
public void appLaunch()
{
	 driver=new FirefoxDriver();
	driver.get("Http://Primusbank.qedgetech.com:9090");
	driver.manage().window().maximize();
}
@Test
public void appLogin()
{
driver.findElement(By.id("txtuId")).sendKeys("Admin");
	
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	
	driver.findElement(By.id("login")).click();
}
@AfterTest
public void appClose()
{
	driver.close();
}
}
