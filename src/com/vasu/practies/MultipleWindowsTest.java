package com.vasu.practies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		String homePage=driver.getWindowHandle();
		//System.out.println(homePage);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		/*for (String child : windows) 
		{
			//closing all the windows
			driver.switchTo().window(child);
			driver.close();
			//giving focus to child window and click on netbanking
			if (!homePage.equals(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
		}*/
		
		Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			String child=it.next().toString();
			if (!homePage.equals(child)) 
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
		}
		
		


	}

}
