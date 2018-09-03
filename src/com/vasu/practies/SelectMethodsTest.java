package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	Select slt=new Select(drop);
	//slt.selectByIndex(34);
	//slt.selectByVisibleText("Books");
	slt.selectByValue("search-alias=electronics");
	//capturing selected item from dropdown 
	//System.out.println(slt.getFirstSelectedOption().getText());
	//verify is it possible to select multiple items from dropdown
	//System.out.println(slt.isMultiple());
	//capturing multiple selected items 
/*List<WebElement> multiple=slt.getAllSelectedOptions();
System.out.println(multiple.size());
for (int i = 0; i < multiple.size(); i++) 
{
	System.out.println(multiple.get(i).getText());
}*/
	//capturing all items from the dropdown
	List<WebElement> dropList=slt.getOptions();
	System.out.println(dropList.size());
	
	for (WebElement webElement : dropList) 
	{
		System.out.println(webElement.getText());
	}
	

	}

}
