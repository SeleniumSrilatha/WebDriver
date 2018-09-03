package com.vasu.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest
{
	public static void main(String[] args)
	{
		//launch firefox
		FirefoxDriver driver=new FirefoxDriver();
		//navigate to Gmail
		driver.get("https://www.amazon.in/");

	}

}
