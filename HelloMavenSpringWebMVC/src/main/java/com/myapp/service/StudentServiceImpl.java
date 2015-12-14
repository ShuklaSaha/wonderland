package com.myapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.myapp.dao.StudentDao;
import com.myapp.to.Student;
@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentDao studentdaoimpl;
	@Override
	public String createStudent(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return "student";
	}
	public String submitForm(Model model,Student student)
	{
		model.addAttribute("student", student);
		studentdaoimpl.addStudent(student);
		return "addstudent";

		
	}
}
