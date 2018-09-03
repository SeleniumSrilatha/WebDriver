package com.vasu.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations
{
@Test
public void testMethod()
{
	System.out.println("TestMethod Executed");
}
@Test
public void testMethod1()
{
	System.out.println("TestMethod1 Executed");
}
@BeforeTest
public void beforeMethod()
{
	System.out.println("BeforeTest Executed");
}
@AfterTest
public void afterMethod()
{
	System.out.println("AfterTest Executed");
}
}
