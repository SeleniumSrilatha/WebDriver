package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ShadiRegTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("first_name")).sendKeys("Selenium");
		driver.findElement(By.id("last_name")).sendKeys("Vasudeva");
		//month
		Select month=new Select(driver.findElement(By.id("dob_m")));
		month.selectByIndex(4);
		Thread.sleep(2000);
		//day
		Select day=new Select(driver.findElement(By.id("dob_d")));
		day.selectByIndex(4);
		Thread.sleep(2000);
		//year
		Select year=new Select(driver.findElement(By.id("dob_y")));
		year.selectByIndex(4);
	}

}
