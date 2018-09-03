package com.vasu.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest 
{
@Test
public void verify()
{
	String data="Vasu";
	String data1="Vasu";
	/*if (data.equals(data1)) 
	{
		System.out.println("pass");
	}else
	{
		System.out.println("Fail");
	}*/
	
	Assert.assertEquals(data, data1,"Both the strings are not equals");
}
}
