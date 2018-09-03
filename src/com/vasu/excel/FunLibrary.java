package com.vasu.excel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FunLibrary 
{
	public FirefoxDriver driver;
	String res;
//appLaunch
	public  String  appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validation
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	// appLogin
	public String appLogin(String userName,String password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(userName);
		
		driver.findElement(By.id("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).click();
		//validation
		if (driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).isDisplayed()) 
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
		
	}
	//branchcreation
	public String branchCreation(String branchName,String add1,String zip) throws Exception
	{
		//find Branches menu and click on it (using xpath)
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		//click on New Branch
		driver.findElement(By.id("BtnNewBR")).click();
		//provide all the required mandatory fields and submit to create new branch
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("Txtadd2")).sendKeys("Gachibowli");
		driver.findElement(By.id("txtZip")).sendKeys(zip);
		//storing the country drop down elements in a variable
		WebElement countrydrop=driver.findElement(By.id("lst_counrtyU"));
		Select countryselect=new Select(countrydrop);
		countryselect.selectByIndex(1);
		Thread.sleep(2000);
		//storing the state drop down elements in a variable
		WebElement statedrop=driver.findElement(By.id("lst_stateI"));
		Select stateselect=new Select(statedrop);
		stateselect.selectByIndex(1);
		Thread.sleep(2000);
		//storing the state drop down elements in a variable
		WebElement citydrop=driver.findElement(By.id("lst_cityI"));
		Select cityselect=new Select(citydrop);
		cityselect.selectByIndex(1);
		//click on submit to create the new branch
		driver.findElement(By.id("btn_insert")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String msg=alt.getText();
		//msg="New Branch with id 50 created Sucessfully"
		alt.accept();
		//validation
		if (msg.contains("created Sucessfully")) 
		{
			res="Pass";
		}else if(msg.contains("already Exist"))
		{
			res="Fail";
		}else if(msg.contains("Please fill in"))
		{
			res="Warning";
		}
		return res;
	}
	//appLogout
	//appClose
		


}
