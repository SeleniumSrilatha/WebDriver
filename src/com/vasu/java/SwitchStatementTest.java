package com.vasu.java;

public class SwitchStatementTest {

	public static void main(String[] args) {
		//  To Display weekday Names for given number
		int number=6;
		switch (number) 
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;//stops 
		case 3:
			System.out.println("Wednessday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("out of range");
			break;
		}

	}

}
