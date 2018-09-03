package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest 
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://primusbank.qedgetech.com:9090/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		//find Branches menu and click on it (using xpath)
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		//click on New Branch
		driver.findElement(By.id("BtnNewBR")).click();
		//provide all the required mandatory fields and submit to create new branch
		driver.findElement(By.id("txtbName")).sendKeys("");
		driver.findElement(By.id("txtAdd1")).sendKeys("");
		driver.findElement(By.id("Txtadd2")).sendKeys("Gachibowli");
		driver.findElement(By.id("txtZip")).sendKeys("55777");
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
			System.out.println("BranchCreated Successfully");
		}else if(msg.contains("already Exist"))
		{
			System.out.println("BranchCreation Failed");
		}else if(msg.contains("Please fill in"))
		{
			System.out.println("Warning Message");
		}
		
	}

}
