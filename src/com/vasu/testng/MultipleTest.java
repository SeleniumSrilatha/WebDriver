package com.vasu.testng;

import org.testng.annotations.Test;

public class MultipleTest 
{
	@Test(priority=1)
	public void appLaunch()
	{
		System.out.println("AppLaunch");
	}
	@Test()
	public void appLogin()
	{
		System.out.println("AppLogin");
	}
	@Test()
	public void appClose()
	{
		System.out.println("Appclose");
	}
	
}
