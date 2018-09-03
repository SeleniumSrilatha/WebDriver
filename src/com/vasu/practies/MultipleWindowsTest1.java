package com.vasu.practies;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest1
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();

		Set<String> windows=driver.getWindowHandles();
		
		for (String tabs : windows)
		{
			driver.switchTo().window(tabs);
			if (!driver.getTitle().equals("JP Morgan"))
			{
				driver.close();
			}
			
			
		}
	}

}
