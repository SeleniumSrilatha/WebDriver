package com.vasu.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest 
{
		public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Srilatha");
		driver.findElement(By.id("lastName")).sendKeys("Selenium");
		driver.findElement(By.id("photofile")).sendKeys("E:\\Koala.jpg");
		//driver.findElement(By.id("photofile")).click();
		
		//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\pranitha.exe");
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed()) 
		{
			System.out.println("Employee Created");
		}else
		{
			System.out.println("Employee Creation Failed");
		}
		

	}

}
