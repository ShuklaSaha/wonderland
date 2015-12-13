package com.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentExcelDao {
	public static void readExcel(String filename) throws IOException
	{
		
		FileInputStream inputstream=new FileInputStream(new File(filename));
		Workbook workbook=new XSSFWorkbook(inputstream);
		Sheet firstsheet=workbook.getSheetAt(0);
		Iterator<Row> iterator=firstsheet.iterator();
		while(iterator.hasNext())
		{
			Row nextRow=iterator.next();
			Iterator<Cell> cellIterator=nextRow.iterator();
			while(cellIterator.hasNext())
			{
				Cell nextCell=cellIterator.next();
				switch(nextCell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.println(nextCell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.println(nextCell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(nextCell.getNumericCellValue());
					break;
				}
				System.out.print("-");
			}
			System.out.println();
		}
		workbook.close();
		inputstream.close();
	}
	public static void writeExcel(String filename) throws IOException
	{
		FileOutputStream outputstream=new FileOutputStream(new File(filename));
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet=workbook.createSheet("Java Books");
		Object[][] bookdata={
				{"Head First Java","Kethy Seria",68},
				{"Java Reference","Shield",30}};
		int rowcount=0;
		for(Object[] book:bookdata)
		{
			Row row=sheet.createRow(++rowcount);
			int cellcount=0;
			for (Object field:book)
			{
				Cell cell=row.createCell(++cellcount);
				if(field instanceof String)
					cell.setCellValue((String)field);
				else if(field instanceof Integer)
					cell.setCellValue((Integer)field);
			}
			
			}
		workbook.write(outputstream);
		}
		
		
	}


