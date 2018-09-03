package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckBoxTest 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		//identify the table by xpath
	WebElement table=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
List<WebElement>  multiCheck=table.findElements(By.tagName("input"));
System.out.println(multiCheck.size());

for (int i = 0; i < multiCheck.size(); i++) 
{
	//System.out.println(multiCheck.get(i).getAttribute("checked")+"-----"+multiCheck.get(i).getAttribute("value"));
//multiCheck.get(i).click();
	if (multiCheck.get(i).getAttribute("value").equals("Cheese")) 
	{
		multiCheck.get(i).click();
		break;
	}
}

	}

}
