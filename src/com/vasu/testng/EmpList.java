package com.vasu.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmpList extends OrangeHRM
{
@Test
public void empList() throws Exception
{
	
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
