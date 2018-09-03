package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		
WebElement account=	driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
WebElement yourOrder=driver.findElement(By.xpath(".//*[@id='nav_prefetch_yourorders']/span"));
 Actions mouse=new Actions(driver);
 mouse.moveToElement(account).build().perform();
 mouse.moveToElement(yourOrder).click().build().perform();
		
		

	}

}
