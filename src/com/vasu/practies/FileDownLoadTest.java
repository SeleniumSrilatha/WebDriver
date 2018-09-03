package com.vasu.practies;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FileDownLoadTest 
{
		public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("3.14.0")).click();
		Thread.sleep(2000);
		
		//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\vasu1.exe");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		

	}

}
