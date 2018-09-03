package com.vasu.java;

import java.util.Scanner;

public class IfStatementTest {

	public static void main(String[] args) 
	{
		// To check the given no is "Even No" / "Odd No"
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Even Number");
		}else
		{
			System.out.println("Odd Number");
		}

	}

}
