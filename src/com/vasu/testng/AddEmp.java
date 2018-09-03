package com.vasu.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmp extends OrangeHRM
{
@Test
public void empAdd() throws Exception
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("Srilatha6");
	driver.findElement(By.id("lastName")).sendKeys("Selenium");
	driver.findElement(By.id("photofile")).sendKeys("E:\\Koala.jpg");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("btnSave")).click();
}
}
