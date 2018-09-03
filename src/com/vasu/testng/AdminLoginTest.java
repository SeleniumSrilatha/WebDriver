package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLoginTest
{
@Test
public void adminLogin()
{
	//String expText="Welcome to Admin";
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("Http://Primusbank.qedgetech.com:9090");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	
	driver.findElement(By.id("login")).click();
	//String actText=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	
	//validation
	//Assert.assertEquals(actText, expText);
	Assert.assertTrue(driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).isDisplayed());
	
}
}
