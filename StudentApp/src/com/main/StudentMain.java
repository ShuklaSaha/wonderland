package com.main;

import java.io.IOException;

import com.dao.StudentDao;
import com.dao.StudentXMLDao;
import com.dao.StudentExcelDao;

public class StudentMain {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String filename=System.getProperty("user.dir")+"\\test.csv";
		//StudentDao.readcsvFile(filename);
	//	StudentDao.writecsvFile(filename);
		//String filename=System.getProperty("user.dir")+"\\first.xlsx";
		//StudentExcelDao.readExcel(filename);
		String filename=System.getProperty("user.dir")+"\\write.xlsx";
		StudentExcelDao.writeExcel(filename);
	}


}
