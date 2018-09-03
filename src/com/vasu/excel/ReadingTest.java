package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingTest 
{
	public static void main(String[] args) throws Exception
	{
		File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		int row=ws.getLastRowNum();
		for (int i = 0; i <=row; i++) 
		{
			String student=ws.getRow(i).getCell(0).getStringCellValue();
			String course=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(student+"----"+course);
		}
	/*String data=ws.getRow(0).getCell(0).getStringCellValue();
	String data1=ws.getRow(0).getCell(1).getStringCellValue();
	System.out.println(data+"----"+data1);*/

	}

}
