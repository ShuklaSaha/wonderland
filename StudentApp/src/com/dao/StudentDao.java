package com.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentDao {

	private static final String COMMA_DELIMITER=",";
	private static final int FIRSTNAME_INDEX=0;
	private static final int LASTNAME_INDEX=1;
	private static final int ROLL_INDEX=2;
	private static final int MARKS_INDEX=3;
	private static final String FILE_HEADER="FIRSTNAME,LASTNAME,ROLL,MARKS";
	private static final String NEW_LINE_SEPERATOR="\n";
	FileWriter filewriter=null;
	public static void readcsvFile(String filename)
	{
		BufferedReader filereader=null;
		List<Student> students=new ArrayList<Student>();
		try
		{
			String line="";
			filereader=new BufferedReader(new FileReader(filename));
			filereader.readLine();
			while((line=filereader.readLine())!=null)
			{
				String[] tokens=line.split(COMMA_DELIMITER);
				if(tokens.length>0)
				{
					Student student=new Student(tokens[FIRSTNAME_INDEX],tokens[LASTNAME_INDEX],Integer.parseInt(tokens[ROLL_INDEX]),Integer.parseInt(tokens[MARKS_INDEX]));
					students.add(student);
					
				}
				
			}
			for(Student list:students)
			{
				System.out.println(list.toString());
			}
		}
		catch(Exception e)
		{
			System.out.println("error in csv file reading");
			e.printStackTrace();
		}
		
	}
	public static void writecsvFile(String filename)
	{
		BufferedReader ad=new BufferedReader(new InputStreamReader(System.in));
		List<Student> students=new ArrayList<Student>();
		FileWriter filewriter=null;
		try
		{
			System.out.println("Enter number of student you want to add:");
			int n=Integer.parseInt(ad.readLine());
			for(int i=1;i<=n;i++)
			{
		Student newstudent=new Student();
		System.out.println("Student FirstName:");
		newstudent.setFirstname(ad.readLine());
		System.out.println("Student  LastName:");
		newstudent.setLastname(ad.readLine());
		System.out.println("Student ROLL:");
		newstudent.setRoll(Integer.parseInt(ad.readLine()));
		System.out.println("Student MARKS:");
		newstudent.setMarks(Integer.parseInt(ad.readLine()));
		students.add(newstudent);
			}
		filewriter=new FileWriter(filename);
		filewriter.append(FILE_HEADER);
		filewriter.append(NEW_LINE_SEPERATOR);
		
		for(Student list:students)
			{
				filewriter.append(list.getFirstname());
				filewriter.append(COMMA_DELIMITER);
				filewriter.append(list.getLastname());
				filewriter.append(COMMA_DELIMITER);
				filewriter.append(String.valueOf(list.getRoll()));
				filewriter.append(COMMA_DELIMITER);
				filewriter.append(String.valueOf(list.getMarks()));
				filewriter.append(NEW_LINE_SEPERATOR);
			}
		System.out.println("CSV file was created successfully");
		}
		
		catch(Exception e)
		{
			System.out.println("error in csv file writing");
			e.printStackTrace();
		}
		finally
		{
			try
			{
			filewriter.flush();
			filewriter.close();
			}
         catch (IOException e)
			{
        	System.out.println("Error while flushing/closing fileWriter !!!");
            e.printStackTrace();

		    }
	
	}
}
}