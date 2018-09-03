package com.vasu.practies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://primusbank.qedgetech.com:9090/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
	File srcFile=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("C:\\Users\\vasu\\Desktop\\ScreenShot\\vasu.png"));
	

	}

}
