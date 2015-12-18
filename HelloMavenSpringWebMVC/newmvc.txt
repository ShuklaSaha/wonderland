package com.myapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.myapp.service.StudentService;
import com.myapp.to.Student;

@Controller
@RequestMapping("/student")
public class StudentController
{
	@Autowired
	StudentService studentserviceimpl;
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String createStudent(Model model)
	{
		return studentserviceimpl.createStudent(model);
		
	}
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String submitForm(Model model,Student student)
	{
		return studentserviceimpl.submitForm(model, student);
	}
	
}