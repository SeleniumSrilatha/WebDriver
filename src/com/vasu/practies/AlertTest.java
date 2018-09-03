package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		//text
		System.out.println(alt.getText());
		//ok
		alt.accept();
		//cancel
		//alt.dismiss();
		//send text
		//alt.sendKeys("Vasu");
		

	}

}
