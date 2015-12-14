package com.myapp.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Repository;

import com.myapp.to.Student;

@Repository
public class StudentDaoImpl implements StudentDao 
{
	static int rowcount=0;
	String filename=System.getProperty("user.dir")+"\\student.xlsx";
	HSSFWorkbook workbook=new HSSFWorkbook();
	HSSFSheet sheet=workbook.createSheet("Student Data");
	
	public void addStudent(Student student)
	{
		Row row=sheet.createRow(++rowcount);
		Cell cell=row.createCell(1);
		cell.setCellValue(student.getFirstname());
	    cell=row.createCell(2);
		cell.setCellValue(student.getLastname());
		cell=row.createCell(3);
		cell.setCellValue(student.getRoll());
		cell=row.createCell(4);
		cell.setCellValue(student.getEmail());
		 cell=row.createCell(5);
		cell.setCellValue(student.getMobileno());
		 cell=row.createCell(6);
		cell.setCellValue(student.getAge());
		 cell=row.createCell(7);
		cell.setCellValue(student.getDob());
		 cell=row.createCell(8);
		cell.setCellValue(student.getGender());
		/* cell=row.createCell(9);
		cell.setCellValue(student.getLanguage());*/
		try
		{
		FileOutputStream outputstream=new FileOutputStream(new File(filename));
		workbook.write(outputstream);
	
		}
		
		catch(IOException e)
		{}
		
		
	}

}