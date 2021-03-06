package com.myapp.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.to.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	static List<Student> allStudents = new ArrayList<Student>();
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String createStudent(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return "student";
		
	}
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String submitForm(Model model,Student student)
	{
		model.addAttribute("student",student);
		
		allStudents.add(student);
		return "addstudent";
	}
	@RequestMapping(value="/viewall")
	public ModelAndView viewStudent()
	{
		List<Student> list=getList();
		ModelAndView mav=new ModelAndView("viewall");
		//Student s=new Student("amg","sha",14,"amgsha",67890,12);
		//allStudents.add(s);
		mav.addObject("students",list);
		return mav;
	}
	
	@RequestMapping(value="/edit/{email}",method=RequestMethod.GET )
	public ModelAndView editStudent(@PathVariable String email)
	{
		ModelAndView mav=new ModelAndView("edit");
		Student s=null;
		String msg="Student not found";
		for (Student student : allStudents) {
			if (student.getEmail().equals(email)) {
				s = student;
				msg="student found";
				break;
			}
		}
		mav.addObject("student",s );
		mav.addObject("msg",msg);
		
		return mav;
		
	}
	@RequestMapping(value="/edit/{email}",method=RequestMethod.POST )
	public ModelAndView editedStudent(@ModelAttribute Student student,@PathVariable String email)
	{
		ModelAndView mav = new ModelAndView("status");
		for (Student stud : allStudents) {
			if (stud.getEmail().equals(email)) {
				stud.setFirstname(student.getFirstname());
				stud.setLastname(student.getLastname());
				stud.setMobileno(student.getMobileno());
				break;
			}
		}
		        String msg = "Record was successfully edited.";
		        mav.addObject("msg", msg);
		        return mav;
	}
	@RequestMapping(value="/delete/{email}")
	public ModelAndView deleteStudent(@PathVariable String email)
	{
		ModelAndView mav=new ModelAndView("deletestatus");
		Student s=null;
		String msg="Student not found";
		for (Student student : allStudents) {
			if (student.getEmail().equals(email)) {
			s=student;
			allStudents.remove(s);
				msg="student deleted succesfully";
				break;
			}
		}
	
		mav.addObject("msg",msg);
		
		return mav;
		
	}
	
	private List<Student> getList()
	{
		return allStudents;
	}
	}