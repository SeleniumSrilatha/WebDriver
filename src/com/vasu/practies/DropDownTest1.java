package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
List<WebElement> dropList=drop.findElements(By.tagName("option"));
System.out.println(dropList.size());
for (WebElement elements : dropList)
{
	//System.out.println(elements.getText());
	//elements.click();
	if (elements.getText().equals("Baby"))
	{
	elements.click();
	break;
	}
}

	}

}
