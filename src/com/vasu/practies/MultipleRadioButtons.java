package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleRadioButtons 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		for(int k=1;k<=2;k++)
		{
		WebElement table=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));

	List<WebElement> multipleRadio=	table.findElements(By.name("group"+k));
	System.out.println(multipleRadio.size());
	for (int i = 0; i < multipleRadio.size(); i++) 
	{
		//System.out.println(multipleRadio.get(i).getAttribute("checked")+"---"+multipleRadio.get(i).getAttribute("value"));
		multipleRadio.get(i).click();
		for (int j = 0; j <multipleRadio.size(); j++)
		{
			System.out.println(multipleRadio.get(j).getAttribute("checked")+"---"+multipleRadio.get(j).getAttribute("value"));
		}
		System.out.println("##########");
	}
		}
	}

}
