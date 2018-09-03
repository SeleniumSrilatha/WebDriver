package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableTesting {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(2000);
	//	System.out.println(driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[3]/td[3]")).getText());
		//rows
List<WebElement>  rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));

		System.out.println(rows.size());
		
		for (int i = 0; i <rows.size(); i++) 
		{
			//coulumn count
	List<WebElement>  col=rows.get(i).findElements(By.tagName("td"));
	/*for (int j = 0; j < col.size(); j++) 
	{
		//row wise coloumn data
		System.out.println(col.get(j).getText());
	}*/
	
	//specific coloumn data
	System.out.println(col.get(2).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
