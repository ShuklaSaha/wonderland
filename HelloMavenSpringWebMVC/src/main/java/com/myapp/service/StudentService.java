package com.myapp.service;

import org.springframework.ui.Model;

import com.myapp.to.Student;

public interface StudentService {
	String createStudent(Model model);
	String submitForm(Model model,Student student);

}
