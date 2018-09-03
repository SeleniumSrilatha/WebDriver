package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClendarTest {

	public static void main(String[] args) throws Exception
	{
	String	date="14/march/2018";
	
	String [] dateSplict=date.split("/");
	String day=dateSplict[0];
	String month=dateSplict[1];
	String year=dateSplict[2];
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.cleartrip.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("DepartDate")).click();
	//driver.findElement(By.id("DepartDate")).sendkeys("14/march/2018");
	Thread.sleep(2000);
	//select year
String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();

while(!calYear.equals(year))
{
	driver.findElement(By.className("nextMonth")).click();
	calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
}
	
//select month
String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
while(!calMonth.equalsIgnoreCase(month))
{
	driver.findElement(By.className("nextMonth")).click();
	calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
}

// select day
List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));

for (int i = 0; i < rows.size(); i++)
{
	List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
	for (int j = 0; j < col.size(); j++) 
	{
		String calDay=col.get(j).getText();
		if (calDay.equals(day)) 
		{
			col.get(j).click();
			break;
		}
	}
}
	}

}
